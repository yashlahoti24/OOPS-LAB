//// Question 1.1
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class ArrayUtils {
//    public static int[] removeDuplicates(int[] arr) {
//        int n = arr.length;
//        int[] uniqueArray = new int[n];
//        int uniqueCount = 0;
//
//        for (int i = 0; i < n; i++) {
//            boolean isDuplicate = false;
//
//            for (int j = 0; j < uniqueCount; j++) {
//                if (arr[i] == uniqueArray[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//            if (!isDuplicate) {
//                uniqueArray[uniqueCount] = arr[i];
//                uniqueCount++;
//            }
//        }
//
//        return Arrays.copyOf(uniqueArray, uniqueCount);
//    }
//}
//
//public class LAB_1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the size of the array: ");
//        int size = scanner.nextInt();
//
//        int[] arr = new int[size];
//
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < size; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        int[] uniqueArray = ArrayUtils.removeDuplicates(arr);
//
//        System.out.println("Array with duplicate elements removed:");
//        for (int element : uniqueArray) {
//            System.out.print(element + " ");
//        }
//    }
//}


// Question 1.2
import java.util.Scanner;

public class LAB_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array A
        System.out.print("Enter the size of Array A: ");
        int sizeA = scanner.nextInt();
        int[] arrayA = new int[sizeA];
        System.out.println("Enter the elements of Array A:");
        for (int i = 0; i < sizeA; i++) {
            arrayA[i] = scanner.nextInt();
        }

        // Input array B
        System.out.print("Enter the size of Array B: ");
        int sizeB = scanner.nextInt();
        int[] arrayB = new int[sizeB];
        System.out.println("Enter the elements of Array B:");
        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = scanner.nextInt();
        }

        // Find common elements
        System.out.println("Common elements between Array A and Array B:");
        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                if (arrayA[i] == arrayB[j]) {
                    System.out.println(arrayA[i]);
                    break;
                }
            }
        }
    }
}

