import java.util.*;

public class PT1 {
  public static void main(String[] args) {

    //Stack Creation
    Stack<Integer> stack = new Stack<>();

    // Stack User Input 
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.print("Enter the number of elements for stack: ");
    int n = scanner.nextInt();
    System.out.println("Enter the elements for stack: ");

    for (int i = 0; i < n; i++) {
      stack.push(scanner.nextInt());
    }

    // Display Stack
    System.out.println("Stack elements: " + stack);
    System.out.println();

    // Queue Creation
    Queue<Integer> queue = new LinkedList<>();

    // Queue User Input
    System.out.println();
    System.out.print("Enter the number of elements for queue: ");
    n = scanner.nextInt();
    System.out.println("Enter the elements for queue: ");
    for (int i = 0; i < n; i++) {
      queue.offer(scanner.nextInt());
    }

    // Display Queue 
    System.out.println("Queue elements: " + queue);
    System.out.println();
  }
}
