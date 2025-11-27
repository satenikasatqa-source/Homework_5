public class ArithmeticExercises {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        double c = 2.0;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(b / c);
        System.out.println(c % b);
        System.out.println(a > b);
        System.out.println(b > c);
        System.out.println(b % c + a);
        System.out.println((b / c + a));
        System.out.println((b + c) <= a);
        System.out.println(a * c + b);

        overflowExample(); 
    }

    public static void overflowExample() {
        int a = Integer.MAX_VALUE;
        System.out.println("a (max int): " + a);

        int overflow = a + 1;
        System.out.println("After overflow (a + 1): " + overflow);
    }

}