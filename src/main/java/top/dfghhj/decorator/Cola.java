package top.dfghhj.decorator;

public class Cola implements KfcPlatedMeals {

    private KfcPlatedMeals platedMeals;

    public Cola(KfcPlatedMeals platedMeals) {
        this.platedMeals = platedMeals;
    }

    public String getName() {
        return platedMeals.getName() + " 可乐";
    }

    public float getPrice() {
        return platedMeals.getPrice() + 2.5f;
    }
}
