package day5;
import java.util.Scanner;
public class task3 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static class CircularLinkedList {
        Node tail = null;
        public void insertAtTail(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void deleteFromHead() {
            if (tail == null) {
                System.out.println("List is empty. Nothing to delete.");
                return;
            }
            Node head = tail.next;
            if (head == tail) {
                System.out.println("Deleted element: " + head.data);
                tail = null;
            } else {
                System.out.println("Deleted element: " + head.data);
                tail.next = head.next;
            }
        }
        public void display() {
            if (tail == null) {
                System.out.println("List is empty.");
                return;
            }
            Node temp = tail.next;
            System.out.print("Circular Linked List: ");
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != tail.next);
            System.out.println();
        }
        public boolean isEmpty() {
            return tail == null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();
        System.out.print("How many nodes to insert initially? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int val = sc.nextInt();
            cll.insertAtTail(val);
        }
        cll.display();
        while (true) {
            if (cll.isEmpty()) {
                System.out.println("List is empty. No more deletions possible.");
                break;
            }
            System.out.print("Delete head? (yes/no): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("yes")) {
                cll.deleteFromHead();
                cll.display();
            } else {
                System.out.println("Stopping deletion.");
                break;
            }
        }
        sc.close();
    }
}

