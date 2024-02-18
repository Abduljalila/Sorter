import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int[] array = {5, 7, 3, 1, 4};
        System.out.println("Original array: " + Arrays.toString(array));

        // Calling the sort method that uses selectionSort
        sortSelection(array);

        System.out.println("Sorted array using selectionSort: " + Arrays.toString(array));

        int[] arrayCopy = {5, 7, 3, 1, 4};

        // Calling the sort method that uses insertionSort
        sortInsert(arrayCopy);

        System.out.println("Sorted array using insertionSort: " + Arrays.toString(arrayCopy));
    }

    public static void selectionSort(int[] list, int startIndex) {
        if (startIndex < list.length - 1) {
            int minIndex = findMinIndex(list, startIndex);
            int temp = list[minIndex];
            list[minIndex] = list[startIndex];
            list[startIndex] = temp;
            selectionSort(list, startIndex + 1);
        }
    }
    private static int findMinIndex(int[] arr, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void sortSelection(int[] array) {
        selectionSort(array, 0);
    }

    public static void sortInsertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void sortInsert(int[] array) {
        sortInsertion(array);
    }
}
