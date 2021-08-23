public class Animals {

    String animalType;
    int numOfAnimals;
    boolean hasBeenFed;

    public Animals(String animalType, int numOfAnimals, boolean hasBeenFed) {
        this.animalType = animalType;
        this.numOfAnimals = numOfAnimals;
        this.hasBeenFed = hasBeenFed;
    }

    public void animalSentence(){
        System.out.print("On my farm I have " + this.numOfAnimals + " " + this.animalType + "'s.");
    }

    public String animalFedOrNot(){
        String fedOrNot;
        if (this.hasBeenFed) {
            fedOrNot = " The " + this.animalType + "'s HAVE been fed!";
        } else {
            fedOrNot = " The " + this.animalType + "'s have NOT been fed!";
        }
        return fedOrNot;
    }

    public void horseSpeak(){
        System.out.println("Neigh! Neigh!");
    }

    public void cowSpeak(){
        System.out.println("Moo! Moo!");
    }
}
