abstract class Beverage {
     // Template method (FIXED)
    public final void makeDrink() {
        boilWater();
        addIngredient();
        pourInCup();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void addIngredient(); // will change

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}