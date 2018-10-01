
// Evaluation of Prefix Expression

// "- + * 2 3 * 5 4 9" Output: 17

import java.util.*;

class PrefixEvaluation {

  static int evaluatePrefix(String exp, int n) {
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = n - 1; i >= 0; i--) {
      if (exp.charAt(i) == ' ' || exp.charAt(i) == ',') {
        continue;
      } else if (isOperator(exp.charAt(i))) {
        int operand1 = stack.peek();
        stack.pop();
        int operand2 = stack.peek();
        stack.pop();
        int result = performOperation(exp.charAt(i), operand1, operand2);
        stack.push(result);
      } else if (Character.isDigit(exp.charAt(i))) {
        String operand = "";
        while (i >= 0 && Character.isDigit(exp.charAt(i))) {
          operand = exp.charAt(i) + operand;
          i--;
        }
        i++;
        stack.push(Integer.parseInt(operand));
      }
    }
    return stack.peek();
  }

  static boolean isOperator(char c) {
    if (c == '+') {
      return true;
    } else if (c == '-') {
      return true;
    } else if (c == '*') {
      return true;
    } else if (c == '/') {
      return true;
    } else {
      return false;
    }
  }

  static int performOperation(char c, int operand1, int operand2) {
    if (c == '+') {
      return operand1 + operand2;
    } else if (c == '-') {
      return operand1 - operand2;
    } else if (c == '*') {
      return operand1 * operand2;
    } else if (c == '/') {
      return operand1 / operand2;
    } else {
      System.out.println("Unexpected error");
      return -1;
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the expression: ");
    String expression = in.nextLine();
    in.close();
    int expLength = expression.length();
    int result = evaluatePrefix(expression, expLength);
    System.out.println("Output: " + result);
  }
}