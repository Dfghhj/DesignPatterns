package top.dfghhj.decorator;

public class FriedChicken implements KfcPlatedMeals {

    private KfcPlatedMeals platedMeals;

    public FriedChicken(KfcPlatedMeals platedMeals) {
        this.platedMeals = platedMeals;
    }

    public String getName() {
        return platedMeals.getName() + " 炸鸡";
    }

    public float getPrice() {
        return platedMeals.getPrice() + 12.5f;
    }
}
