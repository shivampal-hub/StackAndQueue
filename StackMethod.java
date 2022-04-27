public class StackMethod<E> {

    MyStackUC1<E> stk = new MyStackUC1<>();

    public  void push(E data) {

        stk.myLinkedList.addNode(data);

    }

    public void printStack() {

        stk.myLinkedList.display();

    }

    public void pop() {

        stk.myLinkedList.pop();

    }
}
