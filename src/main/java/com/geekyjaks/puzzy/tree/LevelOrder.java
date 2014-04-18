package com.geekyjaks.puzzy.tree;

public class LevelOrder {

  public static void main(String[] args) {

    Node n1 = new Node(1);
    
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    Node n7 = new Node(7);
    
    n1.setLeft(n2);
    n1.setRight(n3);
    n2.setParent(n1);
    n3.setParent(n1);
    
    n2.setLeft(n4);
    n2.setRight(n5);
    
    n4.setParent(n2);
    n5.setParent(n2);
    
    n5.setRight(n6);
    
    n6.setParent(n5);
    
    n3.setRight(n7);
    
    n7.setParent(n3);
    
    BinaryTree bt = new BinaryTree(n1);
    //System.out.println(bt.height());
    
    bt.levelOrder();
  }
}
