
// Add a node after a given node (Using nth position method)

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

  static void print() {
    Node t = head;
    System.out.print("List is: ");
    while (t != null) {
      System.out.print(t.data + " ");
      t = t.next;
    }
    System.out.println();
  }

  static void insert(int pos, int new_data) {
    Node new_node = new Node(new_data);

    if (pos == 1) {
      new_node.next = head;
      head = new_node;
      return;
    }

    Node t = head;
    for (int i = 0; i < pos - 2; i++) {
      t = t.next;
    }
    new_node.next = t.next;
    t.next = new_node;

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    LinkedList llist = new LinkedList();

    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    head.next = second;
    second.next = third;

    print();

    System.out.println("At which position, do you want to insert the new element?");
    int p = in.nextInt();
    System.out.println("Enter the element you want to insert:");
    int x = in.nextInt();
    insert(p, x);

    System.out.print("The new ");
    print();

    in.close();

  }
}