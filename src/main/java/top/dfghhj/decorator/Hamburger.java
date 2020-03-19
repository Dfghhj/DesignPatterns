package top.dfghhj.decorator;

public class Hamburger implements KfcPlatedMeals {

    private KfcPlatedMeals platedMeals;

    public Hamburger(KfcPlatedMeals platedMeals) {
        this.platedMeals = platedMeals;
    }

    public String getName() {
        return platedMeals.getName() + " 汉堡 ";
    }

    public float getPrice() {
        return platedMeals.getPrice() + 16f;
    }
}
