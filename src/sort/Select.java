package sort;

import java.util.Arrays;

public class Select implements SortAlgorithm {
    @Override
    public void sort(Comparable[] dataset) {
        for(int i = 0; i < dataset.length - 2; i ++) {
            for (int j = i + 1; j < dataset.length - 1; j ++) {
                if(greater(dataset[i],dataset[j])) {
                    exch(dataset, i, j);
                }
            }
        }
    }

    @Override
    public boolean greater(Comparable a, Comparable b) {
        return (a.compareTo(b) > 0);
    }

    @Override
    public void exch(Comparable[] dataset, int a, int b) {
        Comparable temp = dataset[a];
        dataset[a] = dataset[b];
        dataset[b] = temp;
    }

    public static void main(String[] args) {
        Integer[] testset = {4, 6, 10, 12, 5, 20, 1, 50};
        new Bubble().sort(testset);
        System.out.println(Arrays.toString(testset));
    }
}
