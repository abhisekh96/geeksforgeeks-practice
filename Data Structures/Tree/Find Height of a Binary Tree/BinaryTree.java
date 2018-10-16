
// Find height of a binary tree
// Height of this binary tree = 3

import java.util.*;

class BinaryTree {
  static class Node {
    int data;
    Node left, right;

    Node(int d) {
      this.data = d;
      this.left = this.right = null;
    }
  }

  static int findHeight(Node root) {
    if (root == null) {
      return -1;
    }
    return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
  }

  public static void main(String args[]) {
    Node root = null;
    BinaryTree bt = new BinaryTree();
    root = new Node(1);
    root.left = new Node(2);
    root.left.left = new Node(3);
    root.left.right = new Node(4);
    root.left.right.left = new Node(5);
    root.left.right.right = new Node(6);
    root.right = new Node(7);
    root.right.left = new Node(8);
    root.right.right = new Node(9);
    int heightOfBinaryTree = findHeight(root);
    System.out.println("Height of this binary tree = " + heightOfBinaryTree);
  }
}