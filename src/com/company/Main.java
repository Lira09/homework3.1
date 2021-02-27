package com.company;

public class Main {

    public static void main(String[] args) {
        int[] ints = new int[] {9,2,16,-8,21,46,-5,43,18,19,21,56,-11,6,2};
        printSort(ints);
        boolean isGrowth = false;
        while (!isGrowth) {
            isGrowth = true;
            for (int i = 1; i < ints.length; i++) {
                if (ints[i - 1] > ints[i]) {
                    int sum = ints[i];
                    ints[i] = ints[i-1];
                    ints[i-1]= sum;
                    isGrowth = false;
                }

            }
            printSort(ints);
        }
    }

    private static void printSort(int[] sort) {
        System.out.print("(");
        for (int i = 0;i < sort.length; i++){
            if(i > 0)    {
                System.out.print((", "));
            }
            System.out.print(sort[i]);
        }
        System.out.print(")");
        System.out.println();
    }

}
