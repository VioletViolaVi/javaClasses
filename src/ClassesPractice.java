public class ClassesPractice {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.DogSpeak();
        String catSays = animals.catSpeak;
        System.out.println(catSays);
    }
}
