package sort;

import java.util.Arrays;

public class Merge {
    Comparable[] comparables;
    public void sort(Comparable[] dataset) {
        int low = 0;
        int high = dataset.length - 1;
        //别忘了给填充数组初始化！
        comparables = new Comparable[dataset.length];
        sort(dataset, low, high);
    }

    public void sort(Comparable[] dataset, int low, int high) {
        if(low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        sort(dataset, low, mid);
        sort(dataset, mid + 1, high);
        merge(dataset, low, mid, high);
    }

    public void merge(Comparable[] dataset, int low, int mid, int high) {
        int compIndex = low;
        int leftIndex = low;
        int rightIndex = mid + 1;

        while(leftIndex <= mid && rightIndex <= high) {
            if (less(dataset[leftIndex],dataset[rightIndex])) {
                comparables[compIndex++] = dataset[leftIndex++];
            } else {
                comparables[compIndex++] = dataset[rightIndex++];
            }
        }

        while(leftIndex <= mid) {
            comparables[compIndex++] = dataset[leftIndex++];
        }

        while(rightIndex <= high) {
            comparables[compIndex++] = dataset[rightIndex++];
        }

        for (int index = low; index <= high; index ++){
            dataset[index] = comparables[index];
        }
    }

    public boolean less(Comparable a, Comparable b) {
        return (a.compareTo(b) < 0);
    }

    public void exch(Comparable[] dataset, int a, int b) {
        Comparable temp = dataset[a];
        dataset[a] = dataset[b];
        dataset[b] = temp;
    }

    public static void main(String[] args) {
        Integer[] testset = {4, 1, 16, 7, 25, 29, 10, 12};
        new Merge().sort(testset);
        System.out.println(Arrays.toString(testset));
    }
}
