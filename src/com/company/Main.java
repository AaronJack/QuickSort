package com.company;

public class Main {

    public static void main(String[] args) {
        int test[] = {8,3,7,5,9,1,0,4,6,2};
        int piv = QuickSort.partition(test, 0, test.length -1);
        QuickSort.quickSort(test, 0, test.length -1);
        //System.out.println(piv);
        for (int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
    }
}
