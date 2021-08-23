import java.util.ArrayList;
import java.util.Arrays;

public class ClassesPractice {
    public static void main(String[] args) {
        /* ANIMAlS CLASS */
        /* HORSES */
        // instantiate horse class
        Horse horse = new Horse();
        // call & print methods from horse class
        horse.horseSpeak();
        horse.animalSentence();
        System.out.println(horse.animalFedOrNot());

        System.out.println("\n");

        /* COWS */
        // cow class instantiated
        Cow cow = new Cow();
        // cow methods called and/or printed
        cow.cowSpeak();
        cow.animalSentence();
        System.out.println(cow.animalFedOrNot());

        System.out.println("\n");

        /* CATS */
        // made Cat class inherit from Animal class
        Cat cat = new Cat();
        // called & printed methods on cat instance
        cat.catSpeak();
        cat.animalSentence();
        System.out.println(cat.animalFedOrNot());

        System.out.println("\n");

        /* PIGS */
        // instantiate pig object from Pig class which is inheriting from Animal class
        Pig pigs = new Pig();
        // call and/or print pig class methods
        pigs.pigSpeak();
        pigs.animalSentence();
        System.out.println(pigs.animalFedOrNot());
        // print out its values of inherited variables
        System.out.println(pigs.animalType);
        System.out.println(pigs.numOfAnimals);
        System.out.println(pigs.hasBeenFed);

        System.out.println("\n");

        /* FOODS CLASS */
        Pizza pizza = new Pizza();
        HotDog hotDog = new HotDog();
        IceCream iceCream = new IceCream();
        ArrayList<Foods> allFoodClasses = new ArrayList<>();
        allFoodClasses.add(pizza);
        allFoodClasses.add(hotDog);
        allFoodClasses.add(iceCream);
        System.out.println(allFoodClasses);


//        /* PIZZA */
//        Pizza pizza = new Pizza();
//        pizza.greeting();
//        System.out.println(pizza.howMuchEach());
//        System.out.println(pizza.orderedOrNot());
//        System.out.println(pizza.informCustomerOnTotalPrice());
//        System.out.println(pizza.sayGoodbye());
//
//        System.out.println("\n");
//
//        /* HOT DOG */
//        HotDog hotDog = new HotDog();
//        hotDog.greeting();
//        System.out.println(hotDog.howMuchEach());
//        System.out.println(hotDog.orderedOrNot()); // only this statement as boolean is false for this example
//        System.out.println(hotDog.informCustomerOnTotalPrice());
//        System.out.println(hotDog.sayGoodbye());
//
//        System.out.println("\n");
//
//        /* ICE CREAM */
//        IceCream iceCream = new IceCream();
//        iceCream.greeting();
//        System.out.println(iceCream.howMuchEach());
//        System.out.println(iceCream.orderedOrNot());
//        System.out.println(iceCream.informCustomerOnTotalPrice());
//        System.out.println(iceCream.sayGoodbye());
    }
}
