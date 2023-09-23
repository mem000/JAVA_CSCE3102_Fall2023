import java.util.Scanner;

public class Arrays_in_JAVA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] a1; //Declare an array of type int
        a1 = new int[size];
        /*-------------------------------------------------*/
        System.out.println("Printing the Array");
        printArray(a1);
        /*-------------------------------------------------*/
        System.out.println("Entering the array elements: ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print("enter a[ " + (i) + " ]: ");
            a1[i] = input.nextInt();
        }
        /*-------------------------------------------------*/
        System.out.println("The sum of array elements");
        System.out.println("Sum = " + sumArray(a1));
        /*-------------------------------------------------*/
        int rows = 3, columns = 3;
        int[][] a2 = new int[rows][columns];
        //assign array elements to random values in range [1, 10]
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                a2[i][j] = (int)(Math.random() * 10 + 1);
            }
        }
        /*-------------------------------------------------*/
        System.out.println("Printing the 2D Array");
        printArray(a2);
        /*-------------------------------------------------*/
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int sumArray(int[] array) {
        int sum = 0;
        //for each Loop
        for (int e: array)
            sum += e;
        return sum;
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
