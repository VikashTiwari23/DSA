public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        for(int i=0;i<k;i++){
            if(node==null) return head;
            node = node.next;
        }

        // Reverse
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;
        for(int i=0;i<k;i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        
        head.next = reverseKGroup(curr,k);
        return prev;
}
