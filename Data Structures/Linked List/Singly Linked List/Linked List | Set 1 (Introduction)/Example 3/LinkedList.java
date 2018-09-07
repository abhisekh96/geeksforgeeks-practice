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

  static void printList() {
    Node n = head;
    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
  }

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();

    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    head.next = second;
    second.next = third;

    printList();
  }
}