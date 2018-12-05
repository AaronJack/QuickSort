package com.company;

public class Main {

    public static void main(String[] args) {
        int test[] = {2,1,3,5,4,6,8,7,9,10};
        QuickSort.quickSort(test, 0, test.length -1);
        //System.out.println(piv);
        for (int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
    }
}
