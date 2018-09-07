// Following is representation of a DLL node in Java language.

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
}