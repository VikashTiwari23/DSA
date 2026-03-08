public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        int carry = 0;
        while(temp1!=null || temp2!=null || carry!=0){
            int val1 = (temp1!=null) ? temp1.val : 0;
            int val2 = (temp2!=null) ? temp2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum/10;
            
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            
            if(temp1!=null) temp1 = temp1.next;
            if(temp2!=null) temp2 = temp2.next;
        }
        return dummy.next;
    }
