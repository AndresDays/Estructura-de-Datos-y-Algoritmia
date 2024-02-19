import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11,90};
        selectionSort(array);
        System.out.println("Arreglo: " + Arrays.toString(array));
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}