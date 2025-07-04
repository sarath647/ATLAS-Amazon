// Node1 class
class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node1 head = null;
    Node1 tail = null;

    public void add(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Circular link
        } else {
            tail.next = newNode; // Add new node after tail
            tail = newNode;      // Move tail to new node
            tail.next = head;    // Maintain circular link
        }
    }

    public void display() {
        Node1 current = head;

        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Circular Linked List Elements: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);  // Stop when we reach the head again

        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();
    }
}