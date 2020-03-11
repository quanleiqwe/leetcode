package com.quan.linked;

public class Demo1290 {

    public int getDecimalValue(ListNode head) {
        int result = 0 ;
        while (head!=null){
            // 这里要注意，需要加括号，移位操作优先级小于加的优先级
            result = (result<<1) + head.val;
            head= head.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(1);

        l1.next= l2;
        l2.next= l3;

        Demo1290 demo = new Demo1290();
        System.out.println(demo.getDecimalValue(l1));

    }
}
