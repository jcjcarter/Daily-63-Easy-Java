package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,4,5};

    printArray(reverse(5,array));
    }

    /* Swaps the elements in an integer based on the value of N. */
    public static int[] reverse(int N, int[] array){
        int Store;
        N--;
        for(int i = 0; i <= N / 2; i++){
            Store = array[N-i];
            array[N-i] = array[i];
            array[i] = Store;
        }
        return array;
    }

    /* Prints out all the elements in an integer array. */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
