public class SelectionSort {
    // Driver code
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {92,1,84,21,67,88,38};
        selectionSort.sort(arr);
        System.out.println("Sorted array");
        selectionSort.printArray(arr);
    }

    /*function to sort an array using selection sort*/
    public void sort(int[] arr) {
        int n = arr.length;

        /*To move unsorted subarray one after the other*/
        for (int i = 0; i < n-1; i++) {
            /* To Find the minimum element in unsorted array*/
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            /* Swap the minimum element with the first element*/
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    /* Prints the array*/
    private void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}