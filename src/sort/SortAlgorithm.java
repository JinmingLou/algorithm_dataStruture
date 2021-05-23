package sort;

public interface SortAlgorithm {
     public void sort(Comparable[] dataset);
     public boolean greater(Comparable a,Comparable b);
     public void exch(Comparable[] dataset,int a,int b);
}
