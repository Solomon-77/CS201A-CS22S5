import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of numerical value: ");
        int ArraySize = scan.nextInt();
        int[] numArray = new int[ArraySize];
        System.out.println("Enter the elements of the numerical array:");
        for (int i = 0; i < ArraySize; i++) {
            numArray[i] = scan.nextInt();
        }

        System.out.println("Numerical Elements of Array:");
        for (int i = 0; i < ArraySize; i++) {
            System.out.println(numArray[i]);
        }

        System.out.print("\nEnter the size of array: ");
		int numOfFriends = Integer.parseInt(scan.nextLine());
		System.out.println("");

		String arrayOfNames[] = new String[numOfFriends];

		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter the name of friend " + (i + 1) + ": ");
			arrayOfNames[i] = scan.nextLine();
		}

		System.out.println("\nFriends Name:");
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("My friend " + (i + 1) + " is ");
			System.out.print(arrayOfNames[i] + "\n");
		}
    }
}
