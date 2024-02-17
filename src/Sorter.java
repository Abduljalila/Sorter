import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello re rer and welcome!");
        int[] array = {5, 7, 3, 1, 4};
        System.out.println("Original array: " + Arrays.toString(array));

        selectionSort(array, 0);

        System.out.println("Sorted array: " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Sorted array using insertionSort:");
        for (int i : array) {
            System.out.print(i + " ");
        }
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
    public static void insertionSort (int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    
    public static void sort(int[] array) {
        insertionSort(array);
    }
}
