import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello re rer and welcome!");
        int[] array = {5, 7, 3, 1, 4};
        System.out.println("Original array: " + Arrays.toString(array));

        sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
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
    public static int findMinIndex(int[] arr, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
    public static void sort(int[] array){
        selectionSort(array,0);
    }
}
