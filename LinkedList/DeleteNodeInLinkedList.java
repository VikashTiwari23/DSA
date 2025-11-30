package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val= val;
        this.next = null;
    }
}

public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode target) {
        target.val = target.next.val;
        target.next = target.next.next;
        return;
    }

    public static void main(String[] args) {
        // Input: head = [4,5,1,9], node = 5
        // Output: [4,1,9]

        // Leetcode 237
    }
}
