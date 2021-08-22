public class ClassesPractice {
    public static void main(String[] args) {

        // instance of Animal class w/ its arguments
        Animals horse = new Animals("horse", 56, false);

        // arguments called from Animals class
        System.out.println(horse.animalType);
        System.out.println(horse.numOfAnimals);
        System.out.println(horse.hasBeenFed);

        // concat called arguments with own strings
        String horseSentence = "On my farm I have " + horse.numOfAnimals + " " + horse.animalType + "'s.";

        // if/elseif based on boolean value
        if (horse.hasBeenFed) {
            String hasBeenFed = " They have all been fed.";
            System.out.println(horseSentence + hasBeenFed);
        } else {
            String hasNotBeenFed = " They have NOT been fed.";
            System.out.println(horseSentence + hasNotBeenFed);
        }

        // horseSpeak() method called
        horse.horseSpeak();



//        String catSays = animals.catSpeak;
//        System.out.println(catSays);
//
//        int numOfCows = animals.cowNums;
//        System.out.println(numOfCows);
    }
}
