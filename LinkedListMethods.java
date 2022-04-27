public class LinkedListMethods<E> extends LinkedListUC2<E> {

    public void addNode(E data) {

        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {

        Node<E> temp = head;
        while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addLast(E data) {

        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;

        } else {
            Node<E> temp = head;

            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newNode;
        }
    }

    public void addBetween(E data, Node<E> prev_node) {

        if (prev_node == null) {
            System.out.println("Node cannot be null");

        }
        else {
            Node<E> newNode = new Node<>(data);
            newNode.next = prev_node.next;
            prev_node.next = newNode;

        }
    }

    public void pop() {

        if(head == null) {
            System.out.println("List is empty");

        }
        else {
            head = head.next;

        }
    }

    public void popLast() {

        if(head == null) {
            System.out.println("List is Empty");

        }
        else {
            Node<E> temp = head;
            Node<E> prev = null;

            while(temp.next!=null) {
                prev = temp;
                temp = temp.next;

            }
            prev.next = null;

        }
    }

    public boolean searchNode(E value) {

        Node<E> temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;

            }
            temp = temp.next;

        }
        return false;

    }

    public void searchNAdd(E data, E value) {

        Node<E> temp = head;

        while(temp.data != value) {
            temp = temp.next;

        }
        Node<E> newNode = new Node<>(data);
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void searchNPop(E value) {

        Node<E> temp = head;

        if (temp == null) {
            System.out.println("List is empty");

        }
        else {
            while (temp.next.data != value) {
                temp = temp.next;

            }
            temp.next = temp.next.next;

        }
    }

    public void size() {

        int count =1;
        Node<E> temp = head;
        while(temp.next != null){
            temp = temp.next;
            count++;

        }

        System.out.println("Size of the list is "+count);
    }
}

