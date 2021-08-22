public class ClassesPractice {
    public static void main(String[] args) {

        /* HORSES */
        // instance of Animal class w/ its arguments
        Animals horse = new Animals("horse", 12, false);

        // arguments called from Animals class
        System.out.println(horse.animalType);
        System.out.println(horse.numOfAnimals);
        System.out.println(horse.hasBeenFed);

        // concat called arguments with own strings
        String horseSentence = "On my farm I have " + horse.numOfAnimals + " " + horse.animalType + "'s.";

        // if/elseif based on boolean value
        if (horse.hasBeenFed) {
            String horseHasEaten = " They have all been fed.";
            System.out.println(horseSentence + horseHasEaten);
        } else {
            String horseHasNotEaten = " They have NOT been fed.";
            System.out.println(horseSentence + horseHasNotEaten);
        }

        // horseSpeak() method called
        horse.horseSpeak();


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
        // another instance
        Animals cat = new Animals("cat", 2, false);

        // called method on cat instance
        cat.catSpeak();
    }
}
