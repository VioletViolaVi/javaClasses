public class ClassesPractice {
    public static void main(String[] args) {
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
    }
}
