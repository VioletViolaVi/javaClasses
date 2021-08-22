public class Animals {

    String animalType;
    int numOfAnimals;
    boolean hasBeenFed;

    public Animals(String animalType, int numOfAnimals, boolean hasBeenFed) {
        this.animalType = animalType;
        this.numOfAnimals = numOfAnimals;
        this.hasBeenFed = hasBeenFed;
    }

    public void horseSpeak(){
        System.out.println("Neigh! Neigh!");
    }

    public void cowSpeak(){
        System.out.println("Moo! Moo!");
    }
}
