package LinkedList;
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class DeleteMiddleOfLinkedList {
    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node DeleteNode (Node head){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        /*
       // Look this approach is also working
        temp =head;
        Node current ;
        int ans = (size%2==0)? (size/2):(size/2)-1;
        for(int i=0;i<ans;i++){
            temp=temp.next;
            
        }
        current = temp.next;
        temp.next = current.next;
        */
       int mid = size / 2;
       if (mid == 0) {
            return head.next;
        }
        temp = head;
        for(int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
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
        System.out.println("The deleted list is : ");
        Node answer = DeleteNode(head);
        printList(answer);
    }
}
