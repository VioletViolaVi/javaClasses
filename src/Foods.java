import java.text.DecimalFormat;

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

    public String howMuchEach(){
        String costEach = "";
        if (this.chosen) {
            // capitalises first letter of food item
            costEach = this.foodName.substring(0, 1).toUpperCase() + this.foodName.substring(1) +  "'s cost " + this.singularPrice + " each.";
        }
        return costEach;
    }

    public String informCustomerOnTotalPrice() {
        String statement = "";
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        if (this.chosen) {
            statement = "That will be £" + decimalFormat.format(totalCost()); // makes number have 2 decimal places
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
