public class SinglyLinedList<T> {
    Node<T> head;
    int counter;

    public SinglyLinedList(){
        counter = 0;
    }

    //Head. Then append.
    public void append(T newData) {
        Node<T> newNode = new Node(newData);
        if (head == null){
            head = newNode;
            counter++;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        counter++;

    }
    public void remove() {
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.data = null;
        current.next = null;
        System.out.println("Removed  " + current.data);
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
