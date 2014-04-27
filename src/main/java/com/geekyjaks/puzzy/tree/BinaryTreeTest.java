package com.geekyjaks.puzzy.tree;

public class BinaryTreeTest {

  public static void main(String[] args) {

    Node n1 = new Node(4);
    
    Node n2 = new Node(2);
    Node n3 = new Node(10);
    Node n4 = new Node(1);
    Node n5 = new Node(3);
    
    n1.setLeft(n2);
    n1.setRight(n3);
    
    n2.setLeft(n4);
    n2.setRight(n5);
    
    Node n6 = new Node(4);
    n3.setLeft(n6);

    Node n7 = new Node(12);
    n3.setRight(n7);

    Node n8 = new Node(11);
    n7.setLeft(n8);
    
    BinaryTree bt = new BinaryTree(n1);
    bt.printInorder();
    System.out.println();
    //bt.printPreorder();
    System.out.println();
    bt.printPostorder();
    //System.out.println("is bst: " + bt.isBst());
    bt.rightTransform();
    System.out.println();
    bt.printPreorder();
  }
}
