package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {0, 2, 3, 4, 5, 2, 1, 0};
        if (arr1.length < 3) {
            System.out.println("Горы не получится.");
            return;
        }
        boolean mountain = (arr1[0] < arr1[1]);
        if (!mountain) {
            System.out.println("Гора не получается.");
            return;
        }
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
            else {
                System.out.println("Гора не получается.");
                return;
            }
        }
        System.out.println("Ура! Гора получается.");

        System.out.println();
        int[] arr21 = {4, 9, 5};
        int[] arr22 = {9, 4, 9, 8, 4};
        int arr23Length = 0;
        int minLength = arr21.length;
        if (minLength > arr22.length) {
            minLength = arr22.length;
        }
        for (int k = 0; k < minLength - 1; k++) {
            if (arr21[k] == arr22[k]) {
                arr23Length = arr23Length + 1;
            }
            if (arr21[k] == arr22[k + 1] && arr21[k+1] == arr22[k]) {
                arr23Length = arr23Length + 2;
            }
            if (arr21[minLength - 1] == arr22[minLength - 1]) {
                arr23Length = arr23Length + 1;
            }
        }
        int[] arr23 = new int[arr23Length];
        for (int n = 0; n < minLength - 1; n++) {
            if (arr21[n] == arr22[n]) {
                arr23[n] = arr21[n];
            }
            if (arr21[n] == arr22[n+1] && arr21[n+1] == arr22[n]) {
                arr23[n] = arr21[n];
                arr23[n+1] = arr21[n+1];
            }
        }
        if (arr21[minLength - 1] == arr22[minLength - 1]) {
            arr23[arr23Length-1] = arr21[minLength-1];
        }
        if (arr23Length == 0) {
            System.out.println("В Ваших массивах нет пересечений.");
        }
        else System.out.println("Массив пересечений " + Arrays.toString(arr23));
    }
}
