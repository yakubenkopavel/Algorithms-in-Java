package com.company.Start.dynamic;

public class LongestSubarray {
    public static void startAction(){
        int[] nums1 = {1,1,0,0,1,1,1,0,1};
        int[] nums2 = {0,1,1,1,0,1,1,0,1};
        int[] nums3 = {1,1,1};

        System.out.println(functionForOne(nums1));
        System.out.println(functionForOne(nums2));
        System.out.println(functionForOne(nums3));
    }

    public static int functionForOne(int[] nums){
        int n = nums.length;
        int currentCount = 0;
        int previousCount = -1;
        int maxCount = 0;

        for(int i = 0; i < n; i++){
            if (nums[i] == 1){
                currentCount++;
            }else{
                maxCount = Math.max(maxCount, currentCount + previousCount);
                previousCount = currentCount;
                currentCount = 0;
            }
        }
        maxCount = Math.max(maxCount, currentCount + previousCount);

        return maxCount;
    }

    public static int function(int[] nums){
        int n = nums.length;
        int max = 0;
        int[] lenSubarray = new int[n];
        int[] result = new int[n];

        lenSubarray[0] = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                lenSubarray[i] = lenSubarray[i-1] + 1;
            }else{
                lenSubarray[i] = 1;
            }
            result[i] = lenSubarray[i];
        }

        for(int i = 2; i < n; i++){
            int dif = lenSubarray[i] - lenSubarray[i-1];
            if(dif == 0){
                result[i] = lenSubarray[i] + lenSubarray[i-2];
            }else if(dif == 1){
                result[i] = result[i-1]+1;
            }else{
                result[i] = 1;
            }
        }

        for (int i = 0; i < n; i++){
            max = Math.max(max, result[i]);
        }

        return (max == n) ?  max-1 : max;
    }
}
