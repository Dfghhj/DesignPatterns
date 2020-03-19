package top.dfghhj.decorator;

public class MashedPotatoes implements KfcPlatedMeals {

    private KfcPlatedMeals platedMeals;

    public MashedPotatoes(KfcPlatedMeals platedMeals) {
        this.platedMeals = platedMeals;
    }

    public String getName() {
        return platedMeals.getName() + " 土豆泥 ";
    }

    public float getPrice() {
        return platedMeals.getPrice() + 8f;
    }
}
