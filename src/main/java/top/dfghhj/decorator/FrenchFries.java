package top.dfghhj.decorator;

public class FrenchFries implements KfcPlatedMeals {

    private KfcPlatedMeals platedMeals;

    public FrenchFries(KfcPlatedMeals platedMeals) {
        this.platedMeals = platedMeals;
    }

    public String getName() {
        return platedMeals.getName() + " 薯条";
    }

    public float getPrice() {
        return platedMeals.getPrice() + 11f;
    }
}
