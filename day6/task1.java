package day6;
import java.util.Scanner;
public class task1 {
    private int[] stackArray;
    private int top;
    private int maxSize;
    public task1(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; 
    }
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed onto the stack.");
            printStack(); 
        } else {
            System.out.println("Stack overflow! Cannot push " + value);
        }
    }
    public void pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack.");
            printStack();
        } else {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
        }
    }
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Current stack: ");
           for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        task1 stack = new task1(size);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Choose an operation: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                   break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        scanner.close();
    }
}
