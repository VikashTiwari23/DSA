public static ListNode mergeTwoLists(ListNode List1,ListNode List2){
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        ListNode i = List1;
        ListNode j = List2;
        while(i!=null && j!=null){
            if(i.val < j.val){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        } 
        while(i!=null){
            k.next = i;
            i = i.next;
            k = k.next;
        }
        while(j!=null){
            k.next = j;
            j = j.next;
            k = k.next;
        }
        return dummy.next;
}
