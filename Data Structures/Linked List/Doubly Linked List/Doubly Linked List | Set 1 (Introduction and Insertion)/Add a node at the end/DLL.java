// Add a node at the end of the list

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
    System.out.print("Linked List in forward: ");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  static void printReverese() {
    Node temp = head;
    System.out.print("Linked list in reverse: ");
    while (temp.next != null) {
      temp = temp.next;
    }
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.prev;
    }
    System.out.println();
  }

  static void append(int new_data) {
    Node new_node = new Node(new_data);
    new_node.next = null;
    if (head == null) {
      new_node.prev = null;
      head = new_node;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new_node;
    new_node.prev = temp;
    System.out.println("After adding " + new_data + " at the end of the linked list.");
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

    print();
    printReverese();
    append(5);
    print();
    printReverese();
  }
}