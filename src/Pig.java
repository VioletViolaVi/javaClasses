public class Pig extends Animals {
    Pig () {
        // inheriting constructor but with pig's own arguments via super()
        super("pig", 3, false);
        /*
            - or u can use "this" keyword i.e:
            this.animalType = "pig";
            this.numOfAnimals = 3;
            this.hasBeenFed = false;
            - super() is called secretly b4 the above code if not written
        */
    }

    public void pigSpeak() {
        System.out.println("Oink! Oink!");
    }
}
