// Check if a given binary tree is binary search tree or not

class BinaryTree {
  static class Node {
    int data;
    Node left, right;

    Node(int d) {
      this.data = d;
      this.left = this.right = null;
    }
  }

  static boolean isBinarySearchTree(Node root) {
    return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  static boolean isBstUtil(Node root, int minValue, int maxValue) {
    if (root == null) {
      return true;
    }
    if (root.data > minValue && root.data < maxValue && 
    isBstUtil(root.left, minValue, root.data) && isBstUtil(root.right, root.data, maxValue)) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String args[]) {
    Node root = null;
    BinaryTree bt = new BinaryTree();
    root = new Node(7);
    root.left = new Node(4);
    root.right = new Node(9);
    root.left.left = new Node(1);
    root.left.right = new Node(6);
    if (isBinarySearchTree(root)) {
      System.out.println("The given binary tree is a binary search tree.");
    } else {
      System.out.println("The given binary tree is not a binary search tree.");
    }
  }
}