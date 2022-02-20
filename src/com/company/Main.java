package com.company;

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
    }
}
