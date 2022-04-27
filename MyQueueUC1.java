public class MyQueueUC1<E> {

    LinkedListMethods<E> myLinkedList = new LinkedListMethods<>();

    public static void main(String[] args) {

        QueueMethod<Integer> queue = new QueueMethod<>();

        queue.enqueu(56);
        queue.enqueu(30);
        queue.enqueu(70);

        queue.printQueue();
    }
}
