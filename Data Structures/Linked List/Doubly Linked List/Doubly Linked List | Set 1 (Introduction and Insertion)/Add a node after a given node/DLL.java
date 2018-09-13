// Given a node as prev_node, insert a new node after the given node

class DLL {
  static Node head;

  static class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
      this.data = d;
      this.prev = null;
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

  static void printReverse() {
    Node temp = head;
    System.out.print("Doubly linked list in reverse: ");
    while (temp.next != null) {
      temp = temp.next;
    }
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.prev;
    }
    System.out.println();
  }

  static void insertAfter(Node prev_node, int new_data) {
    if (prev_node == null) {
      System.out.println("The given previous node can not be null.");
      return;
    }
    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
    new_node.prev = prev_node;
    if (new_node.next != null) {
      new_node.next.prev = new_node;
    }
    System.out.println("After inserting " + new_data + ".");
  }

  public static void main(String[] args) {
    DLL dll = new DLL();
    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);

    head.next = second;
    second.next = third;
    third.next = fourth;

    second.prev = head;
    third.prev = second;
    fourth.prev = third;

    System.out.print("Given doubly linked list is: ");
    print();
    printReverse();
    insertAfter(second, 5);
    System.out.print("The doubly linked list is: ");
    print();
    printReverse();
  }
}