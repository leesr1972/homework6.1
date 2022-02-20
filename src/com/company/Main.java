package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {1, 2, 3, 1, 0};
        if
        boolean mountain = (arr1[0] < arr1[1]);
        int i = 1;
        for (; i <= arr1.length - 2; i++) {
            if (arr1[i] < arr1[i + 1]) {
                continue;
            }
            else break;
        }
        for (; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                continue;
            }
            else break;
        }
    }
}
