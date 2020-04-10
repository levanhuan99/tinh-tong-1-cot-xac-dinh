package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] array={
                {1,2,3,4},
                {2,3,4,5},
                {5,6,7,8}
        };
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so thu tu cot ban muon in :");
        int colum=scanner.nextInt();



        int totalCol=0;
        for (int row =0;row<array.length;row++){
            totalCol+=array[row][colum];
        }
        System.out.println("tong cu cot "+colum+" la "+totalCol);
    }

}
