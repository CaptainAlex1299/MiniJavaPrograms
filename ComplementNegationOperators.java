
public class ComplementNegationOperators {
    public static void main(String[] args) {
        boolean isAnimalASleep = false;
        System.out.println(isAnimalASleep);
        isAnimalASleep = !isAnimalASleep;
        System.out.println(isAnimalASleep);

        //negating operator ~
        int number = 71;
        int negated = ~number;
        System.out.println(number);
        System.out.println(negated);

        double zooTemperature = 1.21;
        System.out.println(zooTemperature); // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature); // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); // -1.21
    }
}
