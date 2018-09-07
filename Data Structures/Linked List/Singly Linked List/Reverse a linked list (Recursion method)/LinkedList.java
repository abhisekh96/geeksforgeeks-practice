// Reverse a linked list using recursion

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

  static void reverse(Node p) {
    if (p.next == null) {
      head = p;
      return;
    }
    reverse(p.next);
    Node q = p.next;
    q.next = p;
    p.next = null;
  }

  static void print() {
    Node n = head;
    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
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

    System.out.print("Given Linkedlist is: ");
    print();
    System.out.println();
    System.out.print("Reversed Linkedlist: ");
    reverse(head);
    print();
  }
}