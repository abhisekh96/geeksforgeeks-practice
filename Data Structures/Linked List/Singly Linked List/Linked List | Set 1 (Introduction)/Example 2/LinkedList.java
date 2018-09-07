// A simple Java program to introduce a linked list

class LinkedList {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();

    llist.head = new Node(1);
    second = new Node(2);
    third = new Node(3);

    llist.head.next = second;
    second.next = third;
  }
}