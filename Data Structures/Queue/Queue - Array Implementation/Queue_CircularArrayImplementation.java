// Queue - Circular Array Implementation

class Queue_CircularArrayImplementation {

  static int maxSize = 100;
  static int[] A = new int[maxSize];
  static int front = -1;
  static int rear = -1;

  static boolean isEmpty() {
    if (front == -1 && rear == -1) {
      return true;
    } else {
      return false;
    }
  }

  static void enqueue(int x) {
    if (isFull()) {
      System.out.println("Queue is full");
      return;
    } else if (isEmpty()) {
      front = rear = 0;
    } else {
      rear = (rear + 1) % maxSize;
    }
    A[rear] = x;
  }

  static void print() {
    if (isEmpty()) {
      System.out.println("Queue is empty.");
    } else {
      System.out.print("Queue: ");
      int count = ((rear + maxSize - front) % maxSize) + 1;
      for (int i = 0; i < count; i++) {
        int index = (i + front) % maxSize;
        System.out.print(A[index] + " ");
      }
      System.out.println();
    }
  }

  static boolean isFull() {
    if ((rear + 1) % maxSize == front) {
      return true;
    } else {
      return false;
    }
  }

  static void front() {
    if (isEmpty()) {
      System.out.println("Can not return front from empty queue.");
    } else {
      System.out.println(A[front]);
    }
  }

  static void rear() {
    if (isEmpty()) {
      System.out.println("Can not return rear from empty queue.");
    } else {
      System.out.println(A[rear]);
    }
  }

  static void dequeue() {
    if (isEmpty()) {
      System.out.println("Can't delete element from an empty queue.");
    } else if (front == rear) {
      front = rear = -1;
    } else {
      front = (front + 1) % maxSize;
    }
  }

  public static void main(String args[]) {
    System.out.println(isEmpty());
    print();
    enqueue(1);
    print();
    enqueue(2);
    print();
    enqueue(3);
    print();
    System.out.println(isEmpty());
    System.out.println(isFull());
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