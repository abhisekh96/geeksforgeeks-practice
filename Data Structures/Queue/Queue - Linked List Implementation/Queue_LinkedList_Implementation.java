// Queue - Linked List Implementation

class Queue_LinkedList_Implementation {
  static Node front;
  static Node rear;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      this.data = d;
      this.next = null;
    }
  }

  static boolean isEmpty() {
    if (front == null && rear == null) {
      return true;
    } else {
      return false;
    }
  }

  static void print() {
    Node temp = front;
    System.out.print("Queue: ");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  static void enqueue(int new_data) {
    Node new_node = new Node(new_data);
    if (front == null && rear == null) {
      front = rear = new_node;
      return;
    }
    rear.next = new_node;
    rear = new_node;
  }

  static void front() {
    if (front == null) {
      System.out.println("Queue is Empty.");
    } else {
      System.out.println(front.data);
    }
  }

  static void rear() {
    if (rear == null) {
      System.out.println("Queue is Empty.");
    } else {
      System.out.println(rear.data);
    }
  }

  static void dequeue() {
    if (front == null) {
      System.out.println("Queue is Empty.");
    } else if (front == rear) {
      front = rear = null;
    } else {
      front = front.next;
    }
  }

  public static void main(String args[]) {
    System.out.println(isEmpty());
    front();
    rear();
    print();
    enqueue(1);
    print();
    enqueue(2);
    print();
    enqueue(3);
    print();
    System.out.println(isEmpty());
    front();
    rear();
    dequeue();
    print();
    dequeue();
    print();
    dequeue();
    print();
    System.out.println(isEmpty());
  }
}