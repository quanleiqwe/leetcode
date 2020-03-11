package com.quan.linked;

public class Demo0202 {
    /**
     * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
     * 利用快慢指针来实现
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
             fast=fast.next;
        }

        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.val ;
    }
}
