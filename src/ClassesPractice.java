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
        // DIFFERENT instance of Animal class
        Animals cow = new Animals("cow", 47, true);

        // concat called arguments with own strings
        String cowSentence = "On my farm I have " + cow.numOfAnimals + " " + cow.animalType + "'s.";

        // cowSpeak() method called
        cow.cowSpeak();

        // if/elseif based on boolean
        String cowEatenOrNot;
        if (cow.hasBeenFed) {
            cowEatenOrNot = " The cows have been fed!";
        } else {
            cowEatenOrNot = " The cows have NOT been fed!";
        }
        System.out.println(cowSentence + cowEatenOrNot);


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
        // print out its values of inherited variables
        System.out.println(pigs.animalType);
        System.out.println(pigs.numOfAnimals);
        System.out.println(pigs.hasBeenFed);
    }
}
