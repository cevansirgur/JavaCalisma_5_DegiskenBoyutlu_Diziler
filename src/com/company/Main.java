package com.company;

public class Main {

    public static void main(String[] args) {
        int dizi[][] = new int[][] [3][];
        dizi[0] = new int[1];
        dizi[1] = new int[2];
        dizi[2] = new int[3];
        for (int i=0; i<3;i++){
            for (int j=0; j<i+1; j++){
                dizi[i][j] = i+j*2;

            }
        }
        for (int i=0; i<3;i++){
            for (int j=0; j<i+1; j++){
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
