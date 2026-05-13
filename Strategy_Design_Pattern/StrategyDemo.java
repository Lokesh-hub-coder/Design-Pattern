package Strategy_Design_Pattern;

import java.util.Arrays;

public class StrategyDemo {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 4, 6};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        SortingContext context = new SortingContext(new BubbleSortStrategy());
        int[] arr1 = array.clone();
        context.performSort(arr1);
        System.out.println("After Bubble Sort: " + Arrays.toString(arr1));
        
        context.setSortingStrategy(new MergeSortStrategy());
        int[] arr2 = array.clone();
        context.performSort(arr2);
        System.out.println("After Merge Sort: " + Arrays.toString(arr2));
        
        context.setSortingStrategy(new QuickSortStrategy());
        int[] arr3 = array.clone();
        context.performSort(arr3);
        System.out.println("After Quick Sort: " + Arrays.toString(arr3));
    }
}
