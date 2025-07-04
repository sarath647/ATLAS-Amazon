public class CustomQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main method to test the custom queue
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();              // Output: 10 20 30

        System.out.println("Peek: " + q.peek()); // Output: 10
        System.out.println("Dequeued: " + q.dequeue()); // Output: 10

        q.display();              // Output: 20 30
        System.out.println("Is full? " + q.isFull());   // false

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);            // Fills the queue
        q.display();

        q.enqueue(70);            // Should show full message
    }
}
