package Basics;

public class RandomValue {
    public static void main(String[] args) {
        double rand1 = Math.random();
        System.out.println("Math.random() :\t" + rand1);
        int rand2 = (int) Math.random();
        System.out.println("(int)Math.random() :\t" + rand2);
        double rand3 = Math.random() * 10;
        System.out.println("Math.random() * 10 :\t " + rand3);
        int rand4 = (int) (Math.random() * 10);
        System.out.println("(int)(Math.random() * 10) :\t " + rand4);
        int a = 2, b = 6;
        //Generate int in range [a, b]
        int rand5 = RandomInt(a, b);
        System.out.println("rand5 = " + rand5);
        //Generate Random Uppercase letter
        char randChar1 = (char) ((Math.random() * ('Z' - 'A' + 1)) + 'A');
        System.out.println("Random Uppercase letter = " + randChar1);
        //Generate Random LowerCase letter
        char randChar2 = (char) ((Math.random() * ('z' - 'a' + 1)) + 'a');
        System.out.println("Random LowerCase letter = " + randChar2);

    }

    public static int RandomInt(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }
}
