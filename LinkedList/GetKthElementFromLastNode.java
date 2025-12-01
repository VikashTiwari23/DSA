package LinkedList;

public class GetKthElementFromLastNode {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;
        for(int i = 1;i<=k;i++){
            if(fast==null) return -1;
            fast=fast.next;
        }
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("The Original linked list is : ");
        printList(head);
        int k = 2; 
        int output = getKthFromLast(head, k);
        System.out.println(k + "th element from the last is: " + output);
    }
}
