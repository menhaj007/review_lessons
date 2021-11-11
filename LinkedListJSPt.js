class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }

}

class SLL {
    constructor(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    push(val) {
        const newNode = new Node(val);
        if (this.length == 0) {
            this.head.val = val;
            this.tail = head;
            this.length++;
        }
        tmp = tail;
        while (tmp != null) {
            tmp = tmp.next;
        }
        tmp.val = val;
        tmp.next = tail;
        tail = tmp;
        this.length++;
    }


}