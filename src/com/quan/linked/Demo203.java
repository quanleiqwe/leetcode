package com.quan.linked;

public class Demo203 {

    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode curr = head.next;
        while (curr.next!=null){
            if(curr.next.val==val){
                curr.next = curr.next.next;
            } else{
                curr = curr.next;
            }
        }
        return temp.next;
    }


}
