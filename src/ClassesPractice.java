public class ClassesPractice {
    public static void main(String[] args) {
        Animals animals = new Animals("horse", 56, true);
        animals.DogSpeak();

        String catSays = animals.catSpeak;
        System.out.println(catSays);

        int numOfCows = animals.cowNums;
        System.out.println(numOfCows);
    }
}
