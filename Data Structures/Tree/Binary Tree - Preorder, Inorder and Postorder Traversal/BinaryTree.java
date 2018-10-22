// Binary Tree Traversal - Preorder, Inorder, Postorder
// Preorder: F D B A C E J G I K
// Inorder: A B C D E F G I J K
// Postorder: A C B E D I G K J F

class BinaryTree {
  static class Node {
    char data;
    Node left, right;

    Node(char d) {
      this.data = d;
      this.left = this.right = null;
    }
  }

  static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }
  static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  static void postorder(Node root) {
    if (root == null) {
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
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
    System.out.print("Preorder: ");
    preorder(root);
    System.out.print("\nInorder: ");
    inorder(root);
    System.out.print("\nPostorder: ");
    postorder(root);
    System.out.println();
  }
}