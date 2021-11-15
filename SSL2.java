public class SSL2<T> {
    Node<T> head;
    Node<T> tail;
    int counter;

    public SSL2(){
        head = null;
        tail= null;
        counter = 0;
    }

    //Head. Then append.
    public void insertAtBeginning(T newData) {
        Node<T> newNode = new Node(newData);
        if (head == null) {
            // head=tail=newNode;
            head = newNode;
            tail = newNode;
            counter++;
            return;
        }
        else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void insertAtEnd(T newData) {
        Node<T> newNode = new Node<T>(newData);
        if (head == null){
            // head = tail = newNode;
            head = newNode;
            tail = head;
            counter++;
            return;
        }
        else {
            tail.next = newNode;
            tail = tail.next;

            // Node<T> current = head;
            // while (current.next != null) {
            //     current = current.next;
            // }
            // current.next = newNode;
            counter++;
        }

    }
    
    //deleteNode
    //1. Head, 2. Intermediate, 3. Last node
    public void deleteHead() {
        if (head == null) return;
        if (head.next == null) {head = null; return;}
        
        Node<T> current = head.next;
        head = current;
        //head = head.next;
    }

    public void deleteNode(T targetValue) {
        Node<T> current = head;
        if (head == null){
            System.out.println("Empty list");
            return;
        }
        else if (head.data == targetValue) {
            head = head.next;
            current = null;
        }
        else {
            while (current.next != null && !current.next.data.equals(targetValue)) {
                current = current.next;
            }
            if (current.next == null){
                System.out.println("Data doesn't exist.");
                return;
            } else {
                Node<T> targetToDelete = current.next;
                current.next = current.next.next;
                targetToDelete = null;
                
            }
        }

        // Node<T> tmp = head;
        // if (head == null) {
        //     System.out.println("There is no node to delete.");
        //     return;
        // } 
        // else if (head.data.equals(targetValue)) {
        //     System.out.println("Head was removed");
        //     head = head.next;
        // } 
        // else {
        //     while (tmp.next != null && tmp.next.data != targetValue) {
        //         tmp = tmp.next;
        //     }
        // }


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
            System.out.print(current.data);
            System.out.println(" -> ");
            current = current.next;
        }
        System.out.println("-----------");
    }
}
