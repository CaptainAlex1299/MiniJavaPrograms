
public class ComplementNegationOperators {
    public static void main(String[] args) {
        boolean isAnimalASleep = false;
        System.out.print(isAnimalASleep);
        isAnimalASleep = !isAnimalASleep;
        System.out.print(isAnimalASleep);

        //negating operator ~
        int number = 71;
        int negated = ~number;
        System.out.print(number);
        System.out.print(negated);
    }
}
