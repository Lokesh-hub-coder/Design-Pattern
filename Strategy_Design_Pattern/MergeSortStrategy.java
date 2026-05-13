package Strategy_Design_Pattern;

/**
 * Concrete Strategy: Merge Sort
 * Implements the SortingStrategy interface using Merge Sort algorithm
 */
public class MergeSortStrategy implements SortingStrategy {
    
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Merge Sort");
        if (array.length == 0) return;
        mergeSort(array, 0, array.length - 1);
    }
    
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    
    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        
        while (j <= right) {
            temp[k++] = array[j++];
        }
        
        for (int x = 0; x < temp.length; x++) {
            array[left + x] = temp[x];
        }
    }
}
