
// Binary Search Tree - Implementation
// Simple program to create a BST of integers and search an element in it

import java.util.*;

class BinarySearchTree {
  static class Node {
    int data;
    Node left, right;

    Node(int d) {
      this.data = d;
      this.left = this.right = null;
    }
  }

  static Node insert(Node root, int new_data) {
    if (root == null) {
      Node new_node = new Node(new_data);
      root = new_node;
    } else if (new_data <= root.data) {
      root.left = insert(root.left, new_data);
      System.out.println(new_data + " inserted at left subtree");
    } else {
      root.right = insert(root.right, new_data);
      System.out.println(new_data + " inserted at right subtree");
    }
    return root;
  }

  static boolean search(Node root, int n) {
    if (root == null) {
      return false;
    } else if (n == root.data) {
      return true;
    } else if (n <= root.data) {
      return search(root.left, n);
    } else {
      return search(root.right, n);
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    Node root = null;
    BinarySearchTree bst = new BinarySearchTree();
    root = insert(root, 15);
    root = insert(root, 10);
    root = insert(root, 20);
    root = insert(root, 8);
    root = insert(root, 12);
    root = insert(root, 18);
    root = insert(root, 22);
    int number;
    System.out.print("Enter the number to be searched: ");
    number = in.nextInt();
    in.close();
    if (search(root, number) == true) {
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }
  }
}