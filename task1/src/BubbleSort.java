class BubbleSort {
    /*driver function*/
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {34, 87, 69, 101, 96, 12};
        bubbleSort.bubbleSort(arr);
        System.out.println("Sorted array");
        bubbleSort.printArray(arr);
    }

    /*function to sort array using bubblesort*/
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        // Loop through until last but one
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap the arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //function to print the array
    private void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}