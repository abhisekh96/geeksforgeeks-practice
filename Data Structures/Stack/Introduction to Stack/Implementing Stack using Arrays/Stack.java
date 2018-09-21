class Stack {
  static final int MAX = 1000;
  static int top = -1;
  static int[] a = new int[MAX];

  static boolean isEmpty() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  }

  static void push(int x) {
    if (top == MAX - 1) {
      System.out.println("Error: Stack overflow.");
      return;
    }
    a[++top] = x;
  }

  static void pop() {
    if (top == -1) {
      System.out.println("Error: No element to pop.");
      return;
    }
    top--;
  }

  static void top() {
    System.out.println(a[top]);
  }

  static void print() {
    System.out.print("Stack: ");
    for (int i = 0; i <= top; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println(isEmpty());
    push(1);
    print();
    push(2);
    print();
    push(3);
    print();
    top();
    pop();
    print();
    push(4);
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
    pop();
  }
}