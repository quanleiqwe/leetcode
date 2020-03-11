package com.quan.array;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 可以理解为找到数组中第一个大于等于该数的索引
 */
public class Demo35 {

    /**
     * 通过遍历来实现
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert1(int[] nums, int target) {
        if(nums==null || nums.length<=0){
            return 0 ;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
             if(nums[i]>=target){
                 return i ;
             }
        }
        return nums.length;
    }

    /**
     * 通过二分法
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        if(nums==null || nums.length<=0){
            return 0 ;
        }
        int right =0 ;
        int left = nums.length-1;
        while (right<left){
            int middle = (right+left)/2;
            if(target>=nums[middle]){
                left = middle;
            }else{
                right = middle;
            }
        }
        return right; 
    }

    public int binarySearch(int[] nums, int target) {
        int left =0 ;
        int right = nums.length-1;
        while (left<=right){
            int middle = (right+left)/2;
            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]<target){
                left=middle+1;
            }else{
                right=middle-1;
            }
        }
        return left;
    }


        public static void main(String[] args) {
        Demo35 demo35 = new Demo35();
        int i = demo35.binarySearch(new int[]{1, 3, 5, 6}, 5);
        System.out.println(i);
    }


}
