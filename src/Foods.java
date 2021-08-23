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
        System.out.println("Here is your complete order!");
    }

    public String orderedOrNot() {
        String order;
        if (this.chosen) {
            order = "You've chosen to buy " + this.quantity + " " + this.foodName + "'s.";
        } else {
            order = "Please place your order!";
        }
        return order;
    }

    public double totalCost() {
        this.totalCost = quantity * singularPrice;
        return this.totalCost;
    }
}
