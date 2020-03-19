package top.dfghhj.decorator;

import junit.framework.TestCase;

public class KfcPlatedMealsTest extends TestCase {

    public void testPlatedMeals() {
        KfcPlatedMeals platedMealsA = new Cola(new FrenchFries(new PlatedMeals("套餐A")));
        System.out.println(platedMealsA.getName() + " /价格：" + platedMealsA.getPrice());
        KfcPlatedMeals platedMealsB = new Cola(new FrenchFries(new Hamburger(new PlatedMeals("套餐B"))));
        System.out.println(platedMealsB.getName() + " /价格：" + platedMealsB.getPrice());

    }

}