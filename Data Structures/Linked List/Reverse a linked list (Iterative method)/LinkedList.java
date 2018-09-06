
// Reverse a Linked List

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
    System.out.print("Linked List: ");
    while (t != null) {
      System.out.print(t.data + " ");
      t = t.next;
    }
    System.out.println();
  }

  static void reverse() {
    Node prev, current, next;
    prev = null;
    next = null;
    current = head;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();

    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);

    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;

    System.out.print("Given ");
    print();
    reverse();
    System.out.print("New ");
    print();
  }
}