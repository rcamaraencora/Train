package task2;

public class Child extends Person {
    private boolean hasBotherOrSister;

    public Child (String name, int age, boolean hasBotherOrSister ){
        this.setName(name);
        this.setAge(age);
        this.hasBotherOrSister= hasBotherOrSister;
    }

    public boolean isHasBotherOrSister() {
        return hasBotherOrSister;
    }

    public void setHasBotherOrSister(boolean hasBotherOrSister) {
        this.hasBotherOrSister = hasBotherOrSister;
    }
}
