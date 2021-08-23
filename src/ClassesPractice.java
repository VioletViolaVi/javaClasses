import java.util.ArrayList;

public class ClassesPractice {
    public static void main(String[] args) {
        /* ANIMAlS CLASS */

        // instantiate instances of the different animal child classes
        Cat cat = new Cat();
        Cow cow = new Cow();
        Horse horse = new Horse();
        Pig pig = new Pig();

        // place each animal instance in an arraylist
        ArrayList<Animals> allAnimalClasses = new ArrayList<>();
        allAnimalClasses.add(cat);
        allAnimalClasses.add(cow);
        allAnimalClasses.add(horse);
        allAnimalClasses.add(pig);

        // iterate through all classes
        for (Animals animal : allAnimalClasses) {
            animal.animalSentence();
            System.out.println(animal.animalFedOrNot());
        }

        System.out.println("\n");
        // calling out .speak() methods using ENHANCED switch statements
        for (Animals animal : allAnimalClasses) {
            switch (animal.animalType) {
                case "cat" -> cat.catSpeak();
                case "cow" -> cow.cowSpeak();
                case "horse" -> horse.horseSpeak();
                case "pig" -> pig.pigSpeak();
                default -> System.out.println("Not one of the animal classes!");
            }
        }

        // getting animal variables
        System.out.println(cat.animalType);
        System.out.println(cat.numOfAnimals);
        System.out.println(cat.hasBeenFed);

        System.out.println(horse.animalType);
        System.out.println(horse.numOfAnimals);
        System.out.println(horse.hasBeenFed);

        System.out.println(cow.animalType);
        System.out.println(cow.numOfAnimals);
        System.out.println(cow.hasBeenFed);

        System.out.println(pig.animalType);
        System.out.println(pig.numOfAnimals);
        System.out.println(pig.hasBeenFed);

        System.out.println("\n");

        /* FOODS CLASS */

        // instantiating & adding food classes to arraylist
        Pizza pizza = new Pizza();
        HotDog hotDog = new HotDog();
        IceCream iceCream = new IceCream();
        ArrayList<Foods> allFoodClasses = new ArrayList<>();
        allFoodClasses.add(pizza);
        allFoodClasses.add(hotDog);
        allFoodClasses.add(iceCream);

        // refactored code to iterate through all food child classes
        for (Foods food : allFoodClasses) {
            food.greeting();
            System.out.println(food.howMuchEach());
            System.out.println(food.orderedOrNot());
            System.out.println(food.informCustomerOnTotalPrice());
            System.out.println(food.sayGoodbye());
            System.out.println("\n");
        }
    }
}
