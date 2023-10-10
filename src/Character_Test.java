import java.util.Scanner;

public class Character_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character: ");
        char c = input.next().charAt(0);
        if (Character.isDigit(c)) {
            System.out.println(c + " is digit.");
        }
        else {
            System.out.println(c + " is not digit.");
        }
    }
}
