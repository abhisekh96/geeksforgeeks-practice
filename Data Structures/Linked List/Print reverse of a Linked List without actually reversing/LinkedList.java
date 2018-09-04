// Print reverse of a Linked List without actually reversing
// Print elements of a linked list in forward and reverse order using recursion

class LinkedList {
  static Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      this.data = d;
      this.next = null;
    }
  }

  static void print(Node head) {
    if (head == null) {
      System.out.println();
      return;
    }
    System.out.print(head.data + " ");
    print(head.next);
  }

  static void printReverse(Node head) {
    if (head == null) {
      // System.out.println();
      return;
    }
    printReverse(head.next);
    System.out.print(head.data + " ");
  }

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();
    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);

    head.next = second;
    second.next = third;
    third.next = fourth;

    System.out.print("Linked List in forward order: ");
    print(head);
    System.out.print("Linked List in reverse order: ");
    printReverse(head);
    System.out.println();
  }
}