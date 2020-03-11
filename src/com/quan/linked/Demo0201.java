package com.quan.linked;

import java.util.HashSet;
import java.util.Set;

public class Demo0201 {

    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        Set<Integer> set = new HashSet<>();
        ListNode index = temp;
        while (index.next != null) {
            if (set.contains(index.next.val)) {
                index.next = index.next.next;
            } else {
                set.add(index.next.val);
                index=index.next;
            }
        }
        return temp.next;

    }
}
