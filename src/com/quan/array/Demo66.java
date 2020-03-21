package com.quan.array;

import sun.applet.resources.MsgAppletViewer;

import java.awt.*;

public class Demo66 {
    /**
     * 需要考虑进位的问题
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length-1; i >= 0; i--) {
            // 如果末位不为9，直接跳出循环 。
            if(digits[i]!=9){
                digits[i] =  digits[i]+1;
                return digits;
            }
            // 如果末位为9，设置为0 ，前面的位也需要进行进位的相加
            digits[i] = 0 ;
        }
        //如果从上面那个循环跳出来，说明从开始到最后一直有进位，也就是说明全是0，
        int[] temp = new int[length+1];
        //那么我们只需要增大数组长度， 将首位设置为1即可
        temp[0] =1;
        return temp;
    }

    /**
     * a < b
     * @param num1
     * @param num2
     */
    public int demo(int num1,int num2){
         while (num1<num2){
             int result = num2/num1;
             num2=Math.max(num1,result);
             num1= Math.min(num1,result);
         }
         return num1;
    }

    public static void main(String[] args) {
        Demo66 demo66 = new Demo66();
        int demo = demo66.demo(6, 42);
        System.out.println(demo);
    }
}
