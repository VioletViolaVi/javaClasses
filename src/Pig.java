public class Pig extends Animals {

    Pig () {
        // inheriting constructor but with pig's own arguments via super()
        super("pig", 3, false);
        /*
            Or u can use "this" keyword:
            - super() is called secretly b4 the below code if not written
            this.animalType = "pig";
            this.numOfAnimals = 3;
            this.hasBeenFed = false;
        */
    }
}
