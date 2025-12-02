package LinkedList;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class IntersectionLInkedList {
    public static Node getIntersectionNode(Node head1,Node head2){
        // code here
        int n1= 0;
        Node temp1= head1;
        Node temp2 = head2;
        while(temp1!=null){
            temp1=temp1.next;
            n1++;
        }
        int n2=0;
        while(temp2!=null){
            temp2=temp2.next;
            n2++;
        }
        temp1=head1;
        temp2=head2;
        int n=(n1>n2)?n1-n2:n2-n1;
        if(n1>n2){
            for(int i=0;i<n;i++){
                temp1=temp1.next;
                while(temp1.next!=temp2.next){
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                temp2=temp2.next;
            }
            while(temp1!=temp2){
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
        }
        return temp1;
    }
    public static void main(String[] args) {
        
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);

        Node head2 = new Node(10);
        head2.next = head1.next.next.next; // 15

        Node intersectionNode = getIntersectionNode(head1, head2);
        if (intersectionNode != null) {
            System.out.println("The intersection point is: " + intersectionNode.data);
        } else {
            System.out.println("No intersection point found.");
        }
    }
}
