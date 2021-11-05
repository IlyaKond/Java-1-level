package Lesson3.HomeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        array0to1();
        array100();
        System.out.println(Arrays.toString(arrayMultiplication2()));
        arrayDiagonal(4,4);
        System.out.print(Arrays.toString(method5(4,5)));
    }

    public static void array0to1() {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else {
                array1[i] = 0;
            }
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
    public static void array100(){
        int[] array2= new int[100];

        for (int i = 0; i < array2.length; i++) {
            array2[i]=i+1;
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
    public static int[] arrayMultiplication2(){
        int[] array3= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if(array3[i]<6) {
                array3[i] *= 2;
            }
        }
        return array3;
    }
    public static void arrayDiagonal(int size1,int size2) {
        int[][] array4 = new int[size1][size2];

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                } else if (j == array4.length - i - 1) {
                    array4[i][j] = 1;
                }
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static int[] method5(int length,int initialValue){
       int [] array5 =new int[length];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = initialValue;

        }
            return array5;
    }

}