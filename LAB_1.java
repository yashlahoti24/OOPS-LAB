// Question 1.1
//import java.util.*;
//
//class ArrayProcessor {
//    private int[] array;
//
//    public ArrayProcessor(int[] array) {
//        this.array = array;
//    }
//
//    public int[] removeDuplicates() {
//        Set<Integer> uniqueElements = new LinkedHashSet<>();
//        for (int element : array) {
//            uniqueElements.add(element);
//        }
//
//        int[] result = new int[uniqueElements.size()];
//        int index = 0;
//        for (int element : uniqueElements) {
//            result[index++] = element;
//        }
//
//        return result;
//    }
//}
//
//public class LAB_1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of elements in the array: ");
//        int size = scanner.nextInt();
//
//        int[] array = new int[size];
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        ArrayProcessor processor = new ArrayProcessor(array);
//        int[] uniqueArray = processor.removeDuplicates();
//
//        System.out.println("Array with duplicate elements removed:");
//        for (int element : uniqueArray) {
//            System.out.print(element + " ");
//        }
//    }
//}

//Question 1.2
import java.util.*;

class ArrayProcessor {
    private int[] array1;
    private int[] array2;

    public ArrayProcessor(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public int[] findCommonElements() {
        Set<Integer> commonElements = new HashSet<>();
        for (int element : array1) {
            for (int value : array2) {
                if (element == value) {
                    commonElements.add(element);
                    break;
                }
            }
        }

        int[] result = new int[commonElements.size()];
        int index = 0;
        for (int element : commonElements) {
            result[index++] = element;
        }

        return result;
    }
}

public class LAB_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the number of elements in the first array: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the number of elements in the second array: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        ArrayProcessor processor = new ArrayProcessor(array1, array2);
        int[] commonElements = processor.findCommonElements();

        // Display common elements
        System.out.println("Common elements between the two arrays:");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }
}

