package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<Person> pl = new ArrayList<>();
        pl.add(new Child("Alejandra", 3, false));
        pl.add(new Child("Juan", 4, true));
        pl.add(new Child("Mario", 5, true));
        pl.add(new Adult("Mario", 30, "9991278876", false));
        pl.add(new Adult("Rodrigo", 33, "9991273177", true));

        System.out.println("Avg: " + Calculator.average(pl));
        System.out.println("Marios: " + Calculator.mariosCounter(pl));
        System.out.println("Brothers: " + Calculator.brotherSisterCounter(pl));
    }
}