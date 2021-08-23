public class Foods {
    String foodName;
    boolean orderOrNot;
    int quantity;
    double singularPrice;
    double totalCost;

    Foods(String foodName, boolean orderOrNot, int quantity, double singularPrice){
        this.foodName = foodName;
        this.orderOrNot = orderOrNot;
        this.quantity = quantity;
        this.singularPrice = singularPrice;
        this.totalCost = quantity * singularPrice;
        System.out.println("Here is your complete order!");
    }



}
