
// Add a node after a given node (Using Previous Node method)

import java.util.*;

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

  static void insert(Node prev_node, int new_data) {
    if (prev_node == null) {
      System.out.println("Previous Node can not be empty. First insert some elements.");
      return;
    }
    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }

  static void print() {
    Node n = head;
    System.out.print("List is: ");
    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
    System.out.println();
  }

  public static void main(String args[]) {
    LinkedList llist = new LinkedList();

    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    head.next = second;
    second.next = third;

    print();
    insert(second, 4);
    print();
  }
}