import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11,90};
        insertionSort(array);
        System.out.println("Arreglo: " + Arrays.toString(array));
    }

    static void insertionSort(int arr[]) {
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
}