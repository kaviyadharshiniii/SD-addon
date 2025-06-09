package day3;
import java.util.Scanner;
public class task2{
   static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
   }
    private Node head;  
    public task2() {
        this.head = null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position. Position must be 1 or greater.");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int currentPosition = 1;
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        if (current == null) {
            System.out.println("Position is beyond the current length. Inserting at the end.");
            insert(data);  
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void traverse() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        task2 list = new task2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of initial elements to insert into the linked list: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int value = scanner.nextInt();
            list.insert(value);
        }
        list.traverse();
        System.out.print("Enter the value to insert: ");
        int newValue = scanner.nextInt();
        System.out.print("Enter the position to insert at : ");
        int position = scanner.nextInt();
        list.insertAtPosition(newValue, position);
        System.out.println("After insertion:");
        list.traverse();
        scanner.close();
    }
}



