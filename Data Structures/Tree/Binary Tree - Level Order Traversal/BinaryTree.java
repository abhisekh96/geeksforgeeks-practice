
// Binary Tree - Level Order Traversal
// Level order traversal for this binary tree = F D J B E G K A C I H

import java.util.*;

class BinaryTree {
  static class Node {
    char data;
    Node left, right;

    Node(char d) {
      this.data = d;
      this.left = this.right = null;
    }
  }

  static void levelOrder(Node root) {
    if (root == null) {
      System.out.println("Error: Tree is empty.");
    } else {
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while (!q.isEmpty()) {
        Node current = q.peek();
        q.remove();
        System.out.print(current.data + " ");
        if (current.left != null) {
          q.add(current.left);
        }
        if (current.right != null) {
          q.add(current.right);
        }
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    Node root = null;
    BinaryTree bt = new BinaryTree();
    root = new Node('F');
    root.left = new Node('D');
    root.right = new Node('J');
    root.left.left = new Node('B');
    root.left.right = new Node('E');
    root.right.left = new Node('G');
    root.right.right = new Node('K');
    root.left.left.left = new Node('A');
    root.left.left.right = new Node('C');
    root.right.left.right = new Node('I');
    root.right.left.right.left = new Node('H');

    levelOrder(root);
  }
}