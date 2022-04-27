public class QueueMethod<E> {

    MyQueueUC1<E> que = new MyQueueUC1<>();

    public void enqueu(E data) {

        que.myLinkedList.addLast(data);
    
    }

    public void printQueue() {

        que.myLinkedList.display();

    }

    public void dequeu() {

        que.myLinkedList.pop();

    }
}
