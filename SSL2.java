public class SSL2<T> {
    Node<T> head;
    Node<T> tail;
    int counter;

    public SSL2(){
        counter = 0;
    }

    //Head. Then append.
    public void append(T newData) {
        Node<T> newNode = new Node(newData);
        if (head == null){
            head = tail = newNode;
            //head = newNode;
            // tail = head;
            counter++;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
        // Node<T> current = head;
        // while (current.next != null) {
        //     current = current.next;
        // }
        // current.next = newNode;
        counter++;

    }

    public void insertAtBeginning(T newData) {
        Node<T> newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            tail = newNode;
            counter++;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void remove() {
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.data = null;
        current.next = null;
        counter--;
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
