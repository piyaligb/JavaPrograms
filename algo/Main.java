package algo;

import algo.sorting.MergeSort;

public class Main {

    public static void main(String[] args) {
	/*// SprialPrint
        int a[][] = {{00,01,02,03,04},
                     {10,11,12,13,14},
                     {20,21,22,23,24},
                     {30,31,32,33,34}};
        SprialPrint sp = new SprialPrint();
        sp.sprialPrint(a, 4, 5);*/


        int a[] ={4,2,7,1,9,3,0};
        /*// Selection Sort
        SelectionSort ss = new SelectionSort();
        a = ss.sort(a);
        // Bubble Sort
        BubbleSort bs = new BubbleSort();
        a = bs.sort(a);
        // insertion sort

        // Quick sort
        QuickSort iS = new QuickSort();
        iS.qSort(a, 0, a.length-1);*/
        // mergesort
        MergeSort ms= new MergeSort();
        ms.mSort(a);

        int len = a.length;
        for (int i = 0; i<len; i++)
            System.out.println(a[i]);



        /*final int iterations = 1;
        long start = System.nanoTime();
        a = bs.sort(a);
        long timeTaken = System.nanoTime() - start;
        System.out.println(String.format("Time taken: %d ns", timeTaken/iterations));*/
    }
}
