// Find inorder successor in a binary search tree

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
    } else if (data < root.data) {
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

  static Node getSuccessor(Node root, int data) {
    Node current = find(root, data);
    if (current == null) {
      return null;
    }
    // Case 1: Node has right subtree
    if (current.right != null) {
      return findMin(current.right);
    }
    // Case 2: Node has no right subtree
    else {
      Node successor = null;
      Node ancestor = root;
      while (ancestor != current) {
        if (current.data < ancestor.data) {
          // Go to the nearest deepest node of the current node
          successor = ancestor;
          ancestor = ancestor.left;
        } else {
          ancestor = ancestor.right;
        }
      }
      return successor;
    }
  }

  static Node find(Node root, int data) {
    if (root == null) {
      return null;
    } else if (root.data == data) {
      return root;
    } else if (data < root.data) {
      return find(root.left, data);
    } else {
      return find(root.right, data);
    }
  }

  static Node findMin(Node root) {
    if (root == null) {
      return null;
    }
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

    System.out.print("Inorder traversal: ");
    inorder(root);
    System.out.println();
    int val = 1;
    Node successor = getSuccessor(root, val);
    if (successor == null) {
      System.out.println("No successor found.");
    } else {
      System.out.println("Inorder successor of " + val + " is: " + successor.data);
    }
  }
}