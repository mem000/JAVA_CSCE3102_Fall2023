public class Printing {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Welcome to Java!");
        System.out.print("Welcome ");
        System.out.print("to Java!\n");
        System.out.println("----------------------");
        System.out.printf("Welcome to Java!\n");
        System.out.printf("Welcome to Java!%n");
        System.out.println("----------------------");
        int x = 5;
        System.out.println("x = " + x);
        System.out.printf("x = %d\n", x);
        System.out.println("----------------------");
        double y = 14.123;
        System.out.println("y = " + y);
        System.out.printf("y = %f\n", y);
        System.out.println("----------------------");
        System.out.println("x = " + x + " and y = " + y);
        System.out.printf("x = %d and y = %f\n", x, y);
        System.out.println("----------------------");
        System.out.println("Welcome" + " to " + "Java");
        System.out.printf("%s %s %s\n", "welcome", "to", "JAVA");
        System.out.println("----------------------");
        /*
        %d  ====> int
        %f  ====> floating-point value
        %b  ====> boolean
        %d  ====> int
        %c  ====> char
        %n  ====> new line (same as \n)
         */
        System.out.println("----------------------");
        System.out.println("Printing a table by printf");
        System.out.printf("%-5s%-5s%-15s\n", "a", "b", "a * b * 0.41");
        for (int a = 5, b = 2; a < 20; a += 2) {
            System.out.printf("%-5d%-5d%-15.1f\n", a, b, a * b * 0.412);
        }
        System.out.println("----------------------");
        System.out.println("----------------------");
    }
}
