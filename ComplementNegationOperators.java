
public class ComplementNegationOperators {
    public static void main(String[] args) {
        boolean isAnimalASleep = false;
        System.out.println(isAnimalASleep);
        isAnimalASleep = !isAnimalASleep;
        System.out.println(isAnimalASleep);

        //negating operator ~
        int number = 71;
        int negated = ~number;
        System.out.println(number); //-70
        System.out.println(negated); // 70

        double zooTemperature = 1.21;
        System.out.println(zooTemperature); // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature); // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); // -1.21
        zooTemperature = --zooTemperature;
        System.out.println(zooTemperature); // -2.21

        //increment and decrement operators

        int parkAttendance = 0;
        System.out.println(parkAttendance);
        System.out.println(++parkAttendance); // 1 (increase value by 1 then returns new value
        System.out.println(parkAttendance++); // 1 (increases value by 1 then returns original value
        System.out.println(parkAttendance); // 2 cuz previous line increased it by 1 new value is 2

        //Binary arithmetic operators

        /*
            a + b (adds two numeric values)
            c - d (subtracts two numeric values)
            e * f (multiplies two numeric values)
            g / h (divides two numeric values)
            i % j (returns the remainder after division of one numeric value by another)
         */
    }
}
