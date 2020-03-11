package com.quan.linked;

public class Demo0206 {
    /**
     * 回文列表，通过快慢指针来实现
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        //为了通过测试用例，为空也是回文列表
        if (head == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        // 翻转后的链表
        ListNode turnNode = null;

        while (fast!=null && fast.next != null) {
            //挨个将中间节点以前的进行翻转
            ListNode curr = slow;
            slow = slow.next;
            fast = fast.next.next;
            curr.next=turnNode;
            turnNode=curr; 

        }

        //如果是偶数的话，需要向后前进
        if (fast != null) {
            slow = slow.next;
        }
        while (turnNode != null && slow != null) {
            if (turnNode.val != slow.val) {
                return false;
            }
            turnNode=turnNode.next;
            slow=slow.next;
        }
        return true;
    }


    public static void main(String[] args) {
        Demo0206 demo = new Demo0206();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next=node2;
        System.out.println(demo.isPalindrome(node1));

    }
}
