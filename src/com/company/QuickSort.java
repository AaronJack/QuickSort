package com.company;

public class QuickSort {
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        int holder = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] <= pivot){
                i++;
                arr[i] = holder;
                arr[i] = arr[j];
                arr[j] = holder;
            }
        }
        arr[right] = holder;
        arr[right] = arr[i + 1];
        arr[i + 1] = holder;
        return i+1;
    }
    public static void quickSort(int[] arr, int left, int right){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int pivot = partition(arr, left, right);
        int i = left;
        int j = right;
        while( i <= j){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if(left < j){
            quickSort(arr, left, right);
        }
        if(right > 1){
            quickSort(arr, i, right);
        }
    }
}
