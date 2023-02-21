public class stack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("stack overFlow");
            return;
        }
        top = top.next;
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        stack Stack = new stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.pop();
        Stack.display();
    }
}
