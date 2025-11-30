package LinkedList;
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
public class MiddleOfLinkedList {

    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int getElment(Node head){
        /*   
        //Look this approach is also working
        int size =0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int ans = size/2;
        temp = head;
        for(int i=0;i<ans;i++){
            temp = temp.next;
        }
        return temp.data;
      */


        Node slow = head;
        Node fast = head;
        while(fast!= null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d= new Node(4);
        Node e = new Node(5);
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("The Original linked list is : ");
        printList(head);
        int output = getElment(head);
        System.out.println(output);
    }
}
