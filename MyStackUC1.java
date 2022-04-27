public class MyStackUC1<E> {

    LinkedListMethods<E> myLinkedList = new LinkedListMethods<>();

    public static void main(String[] args) {

        StackMethod<Integer> stack = new StackMethod<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.printStack();
    }
}
