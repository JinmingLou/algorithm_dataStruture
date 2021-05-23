package sort;

import java.util.Arrays;

public class Insertion implements SortAlgorithm{
    @Override
    public void sort(Comparable[] dataset) {
        for(int i = 1; i < dataset.length - 1; i ++) {
            for (int j = i; j > 0;j --) {
                if (greater(dataset[j-1], dataset[i])) {
                    exch(dataset, j - 1, i);
                }else {
                    break;
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
        Integer[] testset = {2, 6, 10, 12, 5, 20, 1, 52};
        new Bubble().sort(testset);
        System.out.println(Arrays.toString(testset));
    }
}
