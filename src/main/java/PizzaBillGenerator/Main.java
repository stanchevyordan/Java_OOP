package PizzaBillGenerator;

public class Main {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(false);
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheese();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxePizza deluxePizza = new DeluxePizza(false);
        deluxePizza.takeAway();
        deluxePizza.getBill();

    }


}
