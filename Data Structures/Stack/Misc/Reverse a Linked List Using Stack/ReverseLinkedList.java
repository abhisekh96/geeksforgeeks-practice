// Reverse a linked list using stack

// Time complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class ReverseLinkedList {
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
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  static void reverse() {
    if (head == null) {
      System.out.println("First add some elements to reverse the linked list.");
      return;
    }
    Stack<Node> s = new Stack<Node>();
    Node temp = head;
    while (temp != null) {
      s.push(temp);
      temp = temp.next;
    }
    temp = s.peek();
    head = temp;
    s.pop();
    while (!s.empty()) {
      temp.next = s.peek();
      s.pop();
      temp = temp.next;
    }
    temp.next = null;
  }

  public static void main(String args[]) {
    ReverseLinkedList llist = new ReverseLinkedList();

    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);

    head.next = second;
    second.next = third;
    third.next = fourth;

    System.out.print("Given LinkedList: ");
    print();
    reverse();
    System.out.print("Reverse Linked List: ");
    print();

  }
}