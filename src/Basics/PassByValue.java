package Basics;

public class PassByValue {
    //JAVA always uses PASS BY VALUE
    //JAVA doesn't support PASS BY Reference
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of x before fun: " + x);
        fun(x);
        System.out.println("The value of x after fun: " + x);
        System.out.println("---------------------------------");
        x = fun2(x);
        System.out.println("The value of x after fun: " + x);
        System.out.println("---------------------------------");
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Array before calling the function");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        fun3(a);
        System.out.println("Array after calling the function");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        int[] ar = {1, 2, 3, 4, 5};
        fun4(ar);
        System.out.println("Array after calling the function");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");
    }

    public static void fun(int x) {
        x += 5;
        System.out.println("The value of x inside fun: " + x);
    }

    public static int fun2(int x) {
        x += 5;
        return x;
    }

    public static void fun3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= 2;
        }
    }

    public static void fun4(int[] a) {
        int[] b = {9, 8, 7, 6, 5};
        a = b;
        System.out.println("Array inside the function");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
    }
}
