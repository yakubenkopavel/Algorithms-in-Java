package com.company.Start.Merge;

import java.util.Arrays;

public class MergeSort {
    public static void startAction(){
        int len = 21;
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = (int)(Math.random()*100);
        }

        int[] result = function(new int[]{38, 27, 43, 3, 9, 82, 10, 1, 2});

        for(int i : result){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] function(int[] array){
        int len = array.length;
        if(len > 1){
            int[] array1 = function(Arrays.copyOfRange(array, 0, len/2));
            int[] array2 = function(Arrays.copyOfRange(array, len/2, len));
            array = merge(array1, array2);
        }

        return array;
    }

    private static int[] merge(int[] array1, int[] array2){
        int index1 = 0, index2 = 0, index3 = 0;
        int len1 = array1.length, len2 = array2.length;
        int[] array3 = new int[len1 + len2];

        while(index1 < len1 && index2 < len2){
            if(array1[index1] < array2[index2]){
                array3[index3++] = array1[index1++];
            }else{
                array3[index3++] = array2[index2++];
            }
        }

        while(index1 < len1){
            array3[index3++] = array1[index1++];
        }

        while(index2 < len2){
            array3[index3++] = array2[index2++];
        }

        return array3;
    }
}
