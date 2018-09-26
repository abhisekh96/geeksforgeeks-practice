// Check for balanced parentheses in an expression using Stack

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class Solution {

  static boolean arePair(char opening, char closing) {
    if (opening == '(' && closing == ')') {
      return true;
    } else if (opening == '{' && closing == '}') {
      return true;
    } else if (opening == '[' && closing == ']') {
      return true;
    } else {
      return false;
    }
  }

  static boolean areParenthesesBalanced(char[] exp, int n) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < n; i++) {
      if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
        stack.push(exp[i]);
      } else if (exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
        if (stack.isEmpty() || !arePair(stack.peek(), exp[i])) {
          return false;
        } else {
          stack.pop();
        }
      }
    }
    return stack.isEmpty() ? true : false;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an expression: ");
    String expression = in.next();
    int expLength = expression.length();
    in.close();
    char[] expArray = expression.toCharArray();
    if (areParenthesesBalanced(expArray, expLength)) {
      System.out.println("Balanced");
    } else {
      System.out.println("Not Balanced");
    }
  }
}
