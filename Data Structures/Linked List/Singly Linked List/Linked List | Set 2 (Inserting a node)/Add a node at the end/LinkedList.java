
// Add a node at the end

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

  static void insert(int new_data) {
    Node new_node = new Node(new_data);

    if (head == null) {
      head = new_node;
      return;
    }
    Node t = head;
    while (t.next != null) {
      t = t.next;
    }
    t.next = new_node;
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

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    LinkedList llist = new LinkedList();

    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    head.next = second;
    second.next = third;

    print();
    System.out.println("Enter the element you want to insert at the end of the linked list:");
    int x = in.nextInt();
    insert(x);
    print();
    in.close();
  }
}