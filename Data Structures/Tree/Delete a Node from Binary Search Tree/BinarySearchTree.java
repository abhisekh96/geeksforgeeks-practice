// Delete a node in a binary search tree

class BinarySearchTree {
  static class Node {
    int data;
    Node left, right;

    Node(int d) {
      this.data = d;
      this.left = this.right = null;
    }
  }

  static Node insert(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    } else if (data <= root.data) {
      root.left = insert(root.left, data);
    } else {
      root.right = insert(root.right, data);
    }
    return root;
  }

  static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  static Node delete(Node root, int data) {
    if (root == null) {
      return root;
    } else if (data < root.data) {
      root.left = delete(root.left, data);
    } else if (data > root.data) {
      root.right = delete(root.right, data);
    } else {
      // Case 1: No child or leaf node
      if (root.left == null && root.right == null) {
        root = null;
      }
      // Case 2: Only right child
      else if (root.left == null) {
        root = root.right;
      }
      // Case 2: Only left child
      else if (root.right == null) {
        root = root.left;
      }
      // Case 3: Two children
      else {
        Node temp = findMin(root.right);
        root.data = temp.data;
        root.right = delete(root.right, temp.data);
      }
    }
    return root;
  }

  static Node findMin(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }

  public static void main(String[] args) {
    Node root = null;
    BinarySearchTree bst = new BinarySearchTree();
    root = insert(root, 5);
    root = insert(root, 10);
    root = insert(root, 3);
    root = insert(root, 4);
    root = insert(root, 1);
    root = insert(root, 11);
    System.out.print("Inorder traversal of tree before deletion: ");
    inorder(root);
    System.out.println();
    root = delete(root, 5);
    System.out.print("Inorder traversal of tree after deletion: ");
    inorder(root);
    System.out.println();
  }
}