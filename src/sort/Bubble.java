package sort;

import java.util.Arrays;

public class Bubble implements SortAlgorithm{

    @Override
    public void sort(Comparable[] dataset) {
        for(int i = dataset.length - 1; i > 0; i --) {
            for(int j = 0; j < i; j ++) {
                if(greater(dataset[j], dataset[j+1])) {
                    exch(dataset, j, j+1);
                }
            }
        }
    }

    @Override
    public boolean greater(Comparable a, Comparable b) {
        return (a.compareTo(b) > 0);
    }

    @Override
    public void exch(Comparable[] dataset, int i, int j) {
        Comparable temp = dataset[i];
        dataset[i] = dataset[j];
        dataset[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] testset = {4, 6, 10, 12, 5, 20, 1, 50};
        new Bubble().sort(testset);
        System.out.println(Arrays.toString(testset));
    }
}
