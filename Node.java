public class Node<T> {
    T data;
    Node<T> next;
    
    public Node(T initialData) {
        data = initialData;
        this.next = null;
    }
}
