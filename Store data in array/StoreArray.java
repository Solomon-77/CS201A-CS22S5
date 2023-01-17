import java.util.Scanner;

public class StoreArray {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();

        int[] array = new int[10];

        System.out.println("\nEnter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nArray elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + " is ");
            System.out.println(array[i]);
        }
    }
}