package com.quan.array;

public class Demo27 {

    /**
     * 移除指定元素
     * 通过index 来实现，index 前的是已经没有指定元素的列表
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int length = nums.length;
        int index = 0 ;
        for (int i = 0; i < length; i++) {
             if(nums[i]!=val){
                  nums[index++]=nums[i];
             }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3,3};
        Demo27 demo = new Demo27();
        int result = demo.removeElement(arr,1);
        System.out.println(result);
    }
}
