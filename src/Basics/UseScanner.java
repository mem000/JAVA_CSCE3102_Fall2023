package Basics;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Read byte
        System.out.print("Enter int Value: ");
        int num1 = input.nextInt();
        System.out.println("num1 = " + num1);
        //byte num2 = input.nextByte();
        //short num3 = input.nextShort();
        //long num4 = input.nextLong();
        /*-----------------------------------------------------------------*/
        System.out.print("Enter doube Value: ");
        double num5 = input.nextDouble();
        System.out.println("num5 = " + num5);
        //float num6 = input.nextFloat();
        /*-----------------------------------------------------------------*/
        System.out.print("Enter boolean Value: ");
        boolean booleanValue = input.nextBoolean();
        System.out.println("booleanValue = " + booleanValue);
        /*-----------------------------------------------------------------*/
        //input.nextLine(); // This line you have to add (It consumes the \n character)
        System.out.print("Enter a line: ");
        String my_line = input.nextLine();
        System.out.println("my_line = " + my_line);
        System.out.print("Enter a string: ");
        String my_string = input.next();
        System.out.println("my_string = " + my_string);
        /*-----------------------------------------------------------------*/
        //How to read a single character
        System.out.println("Enter a single Character: ");
        char my_char = input.next().charAt(0);
        System.out.println("my_char = " + my_char);
    }
}
