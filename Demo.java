class Node{
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Demo {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(50);

        System.out.print("After inserting 50: ");
        for (Node n = head; n != null; n = n.next)
            System.out.print(n.data + " ");
        System.out.println();

        int key = 40;
        Node curr = head, prev = null;
        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            if (prev == null) head = curr.next;
            else prev.next = curr.next;
            System.out.println("Deleted " + key);
        }

        System.out.print("After deleting 40: ");
        for (Node n = head; n != null; n = n.next)
            System.out.print(n.data + " ");
    }
}
