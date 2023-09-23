
/*
String is a predefined class in the Java library, just like the classes System and Scanner.
The String type is not a primitive type. It is known as a reference type.
 */
public class Strings {
    public static void main(String[] args) {
        String s = "Mahmoud Esmat Mahmoud";
        System.out.println("-----------------------");
        System.out.println("Using charAt");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("tolowercase & toUpperCase");
        String s2 = s.toLowerCase();
        String s3 = s.toUpperCase();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("-----------------------");
        System.out.println("substring");
        String s4 = s.substring(8);
        String s5 = s.substring(8, 15);
        System.out.println(s);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println("-----------------------");
//        System.out.println("Comparing two strings");
//        String s7 = "Mahmoud Esmat Mahmoud";
//        String s8 = new String("Mahmoud Esmat Mahmoud");
//        String s9 = new String("Mahmoud Esmat Mahmoud");
//        String s10 = "Mahmoud Esmat Mahmoud";
//        System.out.println(s7 == s8);
//        System.out.println(s7 == s10);
//        System.out.println(s8 == s9);
//        System.out.println(s7.compareTo(s8));
//        System.out.println(s7.compareTo(s10));
//        System.out.println(s8.compareTo(s9));
//        String s11 = s7.toUpperCase();
//        System.out.println(s7.compareToIgnoreCase(s11));
        System.out.println("-----------------------");
    }
}
