public class SSL {
    Node head;
    int counter = 0;

    public void push(String value) {
        if (head == null) {
            Node tmp = new Node(value);
            this.head = tmp;
            counter++;
        } else {
            System.out.println("Welcome to second Node");
        }
    }
    public void print() {
        if (head != null) {
            System.out.println(head.data);
        }
    }
    
    
    class Node {
        String data;
        Node next;
        public Node(String text) {
            this.data = text;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SSL sl = new SSL();
        sl.push("Hello world");
        sl.print();
        sl.push("Hello world 2");
    }

}