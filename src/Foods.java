public class Foods {
    String foodName;
    boolean chosen;
    int quantity;
    double singularPrice;
    double totalCost;

    Foods(String foodName, boolean chosen, int quantity, double singularPrice){
        this.foodName = foodName;
        this.chosen = chosen;
        this.quantity = quantity;
        this.singularPrice = singularPrice;
        System.out.println("Hello and Welcome to Foods Restaurant!");
    }

    public String orderedOrNot() {
        String order;
        if (this.chosen) {
            order = "You've chosen to buy " + this.quantity + " " + this.foodName + "'s.";
        } else {
            order = "You have ordered nothing. Please place your order!";
        }
        return order;
    }

    public double totalCost() {
        this.totalCost = quantity * singularPrice;
        return this.totalCost;
    }

    public String informCustomerOnPrice() {
        String statement = "";
        if (this.chosen) {
            statement = "That will be £" + totalCost();
        }
        return statement;
    }

    public String sayGoodbye() {
        String goodbye = "";
        if (this.chosen) {
            goodbye = "Thank you and goodbye!";
        }
        return goodbye;
    }
}
