
// Infix to Postfix conversion

// Examples
// "A + B * C - D * E" Output: "ABC*+DE*-"
// "( ( A + B ) * C - D ) * E" Output: "AB+C*D-E*"
// "a + b * ( c ^ d - e ) ^ ( f + g * h ) - i" Output: "abcd^e-fgh*+^*+i-" 
// "2 ^ 3 ^ 2" Output: "232^^"

import java.util.*;

class InfixToPostfix {

  static String infixToPostfix(String exp) {
    Stack<Character> stack = new Stack<Character>();
    String postfix = "";
    for (int i = 0; i < exp.length(); i++) {
      if (exp.charAt(i) == ' ' || exp.charAt(i) == ',') {
        continue;
      } else if (isOperand(exp.charAt(i))) {
        postfix += exp.charAt(i);
      } else if (isOperator(exp.charAt(i))) {
        while (!stack.isEmpty() && stack.peek() != '(' && hasHigherPrecedence(stack.peek(), exp.charAt(i))) {
          postfix += stack.peek();
          stack.pop();
        }
        stack.push(exp.charAt(i));
      } else if (exp.charAt(i) == '(') {
        stack.push(exp.charAt(i));
      } else if (exp.charAt(i) == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
          postfix += stack.peek();
          stack.pop();
        }
        stack.pop();
      }
    }
    while (!stack.isEmpty()) {
      postfix += stack.peek();
      stack.pop();
    }
    return postfix;
  }

  static boolean isOperand(char c) {
    if (c >= '0' && c <= '9') {
      return true;
    } else if (c >= 'a' && c <= 'z') {
      return true;
    } else if (c >= 'A' && c <= 'Z') {
      return true;
    } else {
      return false;
    }
  }

  static boolean isOperator(char c) {
    if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
      return true;
    } else {
      return false;
    }
  }

  static boolean hasHigherPrecedence(char op1, char op2) {
    int op1Weight = getOperatorWeight(op1);
    int op2Weight = getOperatorWeight(op2);

    if (op1Weight == op2Weight) {
      if (isRightAssociative(op1)) {
        return false;
      } else {
        return true;
      }
    }

    if (op1Weight > op2Weight) {
      return true;
    } else {
      return false;
    }
  }

  static boolean isRightAssociative(char op) {
    if (op == '^') {
      return true;
    } else {
      return false;
    }
  }

  static int getOperatorWeight(char op) {
    int weight = -1;
    if (op == '+' || op == '-') {
      weight = 1;
    } else if (op == '*' || op == '/') {
      weight = 2;
    } else if (op == '^') {
      weight = 3;
    }
    return weight;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the infix expression: ");
    String expression = in.nextLine();
    in.close();
    String result = infixToPostfix(expression);
    System.out.println("Output: " + result);
  }
}