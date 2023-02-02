import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfArrayElements {
    public static void main(String[] args) {
        ArrayList<Integer> numArrayList = new ArrayList<Integer>();
        ArrayList<String> stringArrayList = new ArrayList<String>();

        int[] numArray = acceptNumArray();
        String[] stringArray = acceptStringArray();

        numArrayList = copyNumArrayToArrayList(numArray);
        stringArrayList = copyStringArrayToArrayList(stringArray);

        manipulateNumArrayList(numArrayList);
        manipulateStringArrayList(stringArrayList);

        displayArrayListElements(numArrayList);
        displayArrayListElements(stringArrayList);
    }

    public static int[] acceptNumArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the numerical array: ");
        int size = sc.nextInt();
        int[] numArray = new int[size];
        System.out.println("Enter the elements of the numerical array:");
        for (int i = 0; i < size; i++) {
            numArray[i] = sc.nextInt();
        }

        System.out.println("Numerical Elements of Array:");
        for (int i = 0; i < size; i++) {
            System.out.println(numArray[i]);
        }
        return numArray;
    }

    public static String[] acceptStringArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the string array: ");
        int size = Integer.parseInt(sc.nextLine());
        String[] stringArray = new String[size];
        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < size; i++) {
            stringArray[i] = sc.nextLine();
        }
        System.out.println("String Elements of Array:");
        for (int i = 0; i < size; i++) {
            System.out.println(stringArray[i]);
        }
        return stringArray;
    }

    public static ArrayList<Integer> copyNumArrayToArrayList(int[] numArray) {
        ArrayList<Integer> numArrayList = new ArrayList<Integer>();
        for (int num : numArray) {
            numArrayList.add(num);
        }
        return numArrayList;
    }

    public static ArrayList<String> copyStringArrayToArrayList(String[] stringArray) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (String str : stringArray) {
            stringArrayList.add(str);
        }
        return stringArrayList;
    }

    public static void manipulateNumArrayList(ArrayList<Integer> numArrayList) {
        numArrayList.add(0, -1);
        numArrayList.remove(1);
        numArrayList.set(1, 5);
        numArrayList.clear();
    }

    public static void manipulateStringArrayList(ArrayList<String> stringArrayList) {
        stringArrayList.add(0, "new element");
        stringArrayList.remove(1);
        stringArrayList.set(1, "modified element");
        stringArrayList.clear();
    }

    public static void displayArrayListElements(ArrayList<?> arrayList) {
        for (Object element : arrayList) {
            System.out.println(element);
        }
    }
}