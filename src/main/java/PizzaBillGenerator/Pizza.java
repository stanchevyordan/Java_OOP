package PizzaBillGenerator;

public class Pizza {
    private double price;
    private Boolean veg;

    private double extraCheesePrice = 2.20;
    private double extraToppingsPrice = 2.50;
    private double boxPrice = 0.80;

    private double basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayAdded = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 13;
        } else {
            this.price = 15.50;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isTakeAwayAdded = true;
        this.price += boxPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";

        }
        if(isExtraToppingsAdded) {
            bill += "Extra toppings added: " + extraToppingsPrice + "\n";
        }
        if(isTakeAwayAdded) {
            bill += "Take away: " + boxPrice + "\n";
        }

        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}
