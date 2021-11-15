public class Main {
    public static void main(String[] args) {
        // SinglyLinedList<String> ssl = new SinglyLinedList<>();
        // ssl.insertAtEnd("Hello world.");
        // ssl.insertAtEnd("Hello Java!.");
        // ssl.insertAtEnd("Hello JavaScript.");
        // ssl.print();
        // ssl.remove();
        // ssl.print();

        SSL2<Integer> ll = new SSL2<>();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtBeginning(40);
        ll.insertAtBeginning(50);
        ll.print();
        ll.deleteNode(50);
        ll.print();
        ll.deleteNode(10);
        ll.print();
        ll.deleteNode(30);
        ll.print();

        // // line.insertAtBeginning(1);
        // line.insertAtEnd(100);
        // line.insertAtEnd(300);
        // line.insertAtEnd(200);
        // // line.insertAtBeginning(2);
        // // line.insertAtBeginning(3);

        // // line.deleteNode(3);
        // line.deleteNode(100);
        // line.deleteNode(200);
        // // line.deleteNode(300);
        // // line.deleteHead();
        // // line.deleteHead();
        // // line.deleteHead();
        // line.print();
    }
}
