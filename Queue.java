public class Queue {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node front;
    public Node rear;

    void enqueue(int data) {
        Node newnode = new Node(data);
        if (front == null) {
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("the queue is empty");

        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void display() {
        Node current = front;
        if (front == null) {
            System.out.println("list is empty");

        } else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.display();
    }
}