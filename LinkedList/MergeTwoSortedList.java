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
public static ListNode mergeTwoLists(ListNode List1,ListNode List2){
        if(List1==null) return List2;
        if(List2==null) return List1;
        if(List1.val<List2.val){
            List1.next = mergeTwoLists(List1.next,List2);
            return List1;
        }
        else {
            List2.next = mergeTwoLists(List1,List2.next);
            return List2; 
        }
}
