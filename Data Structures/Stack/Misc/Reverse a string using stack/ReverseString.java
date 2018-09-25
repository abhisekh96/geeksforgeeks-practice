
// Reverse a string using stack

import java.util.*;

class ReverseString {

  static void reverse(char[] c, int n) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < n; i++) {
      stack.push(c[i]);
    }
    for (int i = 0; i < n; i++) {
      c[i] = stack.peek();
      stack.pop();
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] c = new char[100];
    System.out.print("Enter a string: ");
    String word = in.next();
    int l = word.length();
    c = word.toCharArray();
    reverse(c, l);
    System.out.print("Reversed string is: ");
    for (char i : c) {
      System.out.print(i);
    }
    System.out.println();
    in.close();
  }
}