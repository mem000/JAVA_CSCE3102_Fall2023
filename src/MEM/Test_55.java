package MEM;

public class Test_55 {
    public static void main(String[] args) {
        System.out.println("Mahmoud");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int x = 4;
        String ss = "TTT";
        System.out.println("x = " + x);
        System.out.println("ss = " + ss);
        System.out.println("sum = " + sum(3, 5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
