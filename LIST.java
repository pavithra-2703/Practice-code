public class LIST {
    int data;
    Node next;

    LIST(int data) {
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        first.next = second;

        System.out.println("First node data: " + first.data);
        System.out.println("Second node data: " + first.next.data);
    }
}




