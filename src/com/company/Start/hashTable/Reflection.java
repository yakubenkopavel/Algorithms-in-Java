package com.company.Start.hashTable;

import java.util.HashSet;

public class Reflection {
    public static void startAction() {
        int[][] points1 = new int[][]{{0, 0}, {1, 0}};
        int[][] points2 = new int[][]{{1, 1}, {-1, -1}};

        System.out.println(function(points1));
        System.out.println(function(points2));
    }

    public static boolean function(int[][] points) {
        int n = points.length;
        int leftX = Integer.MAX_VALUE;
        int rightX = Integer.MIN_VALUE;
        int x;
        int y;

        HashSet<String> table = new HashSet<>();
        for(int i = 0; i < n; i++){
            x = points[i][0];
            y = points[i][1];

            leftX = Math.min(leftX, x);
            rightX = Math.max(rightX, x);
            table.add(Integer.toString(x)+"/"+ Integer.toString(y));
        }

        double middleX = leftX + (double)(rightX - leftX) / 2;

        for(int i = 0; i < n; i++){
            x = points[i][0];
            y = points[i][1];

            int symmetricX = (int)(2*middleX - x);
            if(!table.contains(Integer.toString(symmetricX)+"/"+Integer.toString(y))){
                return false;
            }
        }

        return true;
    }
}
