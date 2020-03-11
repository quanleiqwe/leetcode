package com.quan.array;

public class Demo26 {
    /**
     * 删除排序数组中的重复项
     * 通过设置index 来实现，index 代表一个分水岭，在它之前的是不重复的，之后是重复的。
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int index = 1;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3,3};
        Demo26 demo = new Demo26();
        int result = demo.removeDuplicates(arr);
        System.out.println(result);
    }
}
