public class InsertionSort {
    /* function to print array of size n*/
    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 56, 43, 1, 21};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);

        printArray(arr);
    }

    /*Function to sort array using insertion sort*/
    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
  /* Move elements of array,greater than key value, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}