// Add a node at the front

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

  static void printForward() {
    Node temp = head;
    System.out.print("Doubly linked list in forward: ");
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

  static void push(int new_data) {
    Node new_node = new Node(new_data);
    new_node.next = head;
    new_node.prev = null;
    if (head != null) {
      head.prev = new_node;
    }
    head = new_node;
    System.out.println("After inserting " + new_data + " at the head of the doubly linked list.");
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

    fourth.prev = third;
    third.prev = second;
    second.prev = head;

    System.out.println("Given doubly linked list is: ");
    printForward();
    printReverse();
    push(5);
    printForward();
    printReverse();

  }
}