package com.company.Start.Merge;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArrayWithSpace {
    public static void startAction(){
        ArrayList<Integer> array1 = new ArrayList<>(){
            {
                add(27);
                add(38);
                add(43);
            }
        };

        ArrayList<Integer> array2 = new ArrayList<>(){
            {
                add(3);
                add(9);
                add(10);
            }
        };

        function(array1, array2);
        for(int i : array1){
            System.out.print(i + " ");
        }

    }

    public static void function(ArrayList<Integer> a, ArrayList<Integer> b){
        int index1 = 0, index2 = 0, index3 = 0;
        int n = b.size();
        Integer[] array = new Integer[2*n];

        while(index1 < n && index2 < n){
            if(a.get(index1) < b.get(index2)){
                array[index3++] = a.get(index1++);
            }else{
                array[index3++] = b.get(index2++);
            }
        }

        while(index1 < n){
            array[index3++] = a.get(index1++);
        }

        while(index2 < n){
            array[index3++] = b.get(index2++);
        }

        for(int i = 0; i < n; i++){
            a.set(i, array[i]);
        }

        for(int i = n; i < 2*n; i++){
            a.add(array[i]);
        }
    }
}
