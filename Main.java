public class Main {
    public static void main(String[] args) {
        SinglyLinedList<String> ssl = new SinglyLinedList<>();
        // ssl.append("Hello world.");
        // ssl.append("Hello Java!.");
        // ssl.append("Hello JavaScript.");
        // ssl.print();
        // ssl.remove();
        // ssl.print();

        SSL2<Integer> line = new SSL2<>();

        line.insertAtBeginning(1);
        line.append(100);
        line.append(200);
        line.append(300);
        line.insertAtBeginning(2);
        line.insertAtBeginning(3);
        line.print();
    }
}
