package top.dfghhj.decorator;

public class PlatedMeals implements KfcPlatedMeals {

    private String name;

    public PlatedMeals(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name + ":";
    }

    public float getPrice() {
        return 0;
    }
}
