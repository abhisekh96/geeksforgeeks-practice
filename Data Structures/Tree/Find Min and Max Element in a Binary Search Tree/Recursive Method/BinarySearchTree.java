// Find Min and Max Element in a Binary Search Tree (Recursive Method)

class BinarySearchTree {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
      this.data = d;
      this.left = this.right = null;
    }
  }

  static Node insert(Node root, int newData) {
    if (root == null) {
      Node newNode = new Node(newData);
      root = newNode;
    } else if (newData <= root.data) {
      root.left = insert(root.left, newData);
    } else {
      root.right = insert(root.right, newData);
    }
    return root;
  }

  static void findMin(Node root) {
    if (root == null) {
      System.out.println("Error: Tree is empty.");
    } else {
      if (root.left == null) {
        System.out.println("Minimum element = " + root.data);
        return;
      }
      findMin(root.left);
    }
  }

  static void findMax(Node root) {
    if (root == null) {
      System.out.println("Error: Tree is empty.");
    } else {
      if (root.right == null) {
        System.out.println("Maximum element = " + root.data);
        return;
      }
      findMax(root.right);
    }
  }

  public static void main(String args[]) {
    Node root = null;
    BinarySearchTree bst = new BinarySearchTree();
    root = insert(root, 15);
    root = insert(root, 10);
    root = insert(root, 20);
    root = insert(root, 8);
    root = insert(root, 12);
    root = insert(root, 17);
    root = insert(root, 25);
    findMin(root);
    findMax(root);
  }
}