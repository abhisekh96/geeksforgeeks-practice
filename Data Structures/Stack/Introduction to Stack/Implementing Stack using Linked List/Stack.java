class Stack {
  static Node top;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  static boolean isEmpty() {
    if (top == null) {
      return true;
    } else {
      return false;
    }
  }

  static void push(int x) {
    Node new_node = new Node(x);
    new_node.next = top;
    top = new_node;
  }

  static void pop() {
    if (top == null) {
      System.out.println("No element to pop");
      return;
    }
    Node temp = top;
    top = top.next;
  }

  static void top() {
    System.out.println(top.data);
  }

  static void print() {
    Node temp = top;
    System.out.print("Stack: ");
    while(temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    System.out.println(isEmpty());
    push(1);
    print();
    push(2);
    print();
    push(3);
    print();
    System.out.println(isEmpty());
    top();
    pop();
    print();
    pop();
    print();
    pop();
    print();
    System.out.println(isEmpty());
  }
}

