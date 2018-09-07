
// Add a node at the front

import java.util.*;

class LinkedList {
  static Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  static void insert(int new_data) {
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
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

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();
    Scanner in = new Scanner(System.in);

    System.out.println("How many numbers?");
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("\nEnter the number:");
      int x = in.nextInt();
      insert(x);
      print();
    }
    in.close();
  }
}