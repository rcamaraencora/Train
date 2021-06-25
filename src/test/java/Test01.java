
import static io.restassured.RestAssured.*;
import com.google.gson.GsonBuilder;
import io.restassured.path.json.mapper.factory.GsonObjectMapperFactory;
import org.testng.annotations.*;
import io.restassured.RestAssured;
import task3.Post;
import static org.hamcrest.Matchers.*;

public class Test01 {
    @BeforeTest
    public void before() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }

    @Test
    public void Test200() {
        when()
                .get("/posts/")
                .then()
                .log().all()
                .and()
                .assertThat().statusCode(200);
    }

    @Test
    public void Test100() {
        when()
                .get("/posts/")
                .then()
                .assertThat()
                .log().all()
                .and()
                .body("size()", is(100));
    }

    @Test
    public void TestOdd() {
        get("/posts/")
                .then()
                .extract()
                .jsonPath()
                .using((GsonObjectMapperFactory) (aClass, s) -> new GsonBuilder().setPrettyPrinting().create())
                .getList("findAll{it.id%2 != 0}", Post.class)
                .forEach(post -> System.out.println(post.getId() +"-"+post.getTitle()));
    }
}


