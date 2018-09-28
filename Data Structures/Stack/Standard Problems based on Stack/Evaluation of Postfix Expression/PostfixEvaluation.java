
// Evaluation of postfix expression

// "100,200,+,2,/,5,*,7,+" Output: 757
// "2 3 * 5 4 * + 9 -" - Output: 17

import java.util.*;

class PostfixEvaluation {

  static int evaluatePostfix(String exp) {
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);
      if (c == ' ' || c == ',') {
        continue;
      } else if (isOperator(c)) {
        int operand2 = stack.peek();
        stack.pop();
        int operand1 = stack.peek();
        stack.pop();
        int result = performOperation(c, operand1, operand2);
        stack.push(result);
      } else if (Character.isDigit(c)) {
        int operand = 0;
        while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
          operand = (operand * 10) + (int) (exp.charAt(i) - '0');
          i++;
        }
        i--;
        stack.push(operand);
      }
    }
    return stack.peek();
  }

  static boolean isOperator(char c) {
    if (c == '+' || c == '-' || c == '*' || c == '/') {
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
      System.out.println("Unexpected Error.");
      return -1;
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the postfix expression: ");
    String expression = in.nextLine();
    in.close();
    int result = evaluatePostfix(expression);
    System.out.println("Output: " + result);
  }
}