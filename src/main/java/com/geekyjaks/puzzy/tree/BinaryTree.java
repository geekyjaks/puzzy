package com.geekyjaks.puzzy.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTree {

  private Node root;

  public BinaryTree(Node root) {
    this.root = root;
  }

  private void inorder(Node node) {
    if (node == null)
      return;

    inorder(node.getLeft());
    System.out.print("->" + node.getKey());
    inorder(node.getRight());
  }

  public void printInorder() {
    inorder(root);
  }

  private void preOrder(Node node) {
    if (node == null)
      return;

    System.out.print("->" + node.getKey());
    preOrder(node.getLeft());
    preOrder(node.getRight());
  }

  public void printPreorder() {
    preOrder(root);
  }

  private void postOrder(Node node) {
    if (node == null)
      return;

    postOrder(node.getLeft());
    postOrder(node.getRight());
    System.out.print("->" + node.getKey());
  }

  public void printPostorder() {
    postOrder(root);
  }

  public int height() {
    return height(root);
  }

  private int height(Node node) {

    if (node == null)
      return -1;

    int l = 1 + height(node.getLeft());
    int r = 1 + height(node.getRight());

    if (l >= r)
      return l;

    return r;
  }

  public void levelOrder() {
    Node n = root;
    Queue<LevelInfo> queue = new LinkedBlockingQueue<LevelInfo>();
    queue.offer(new LevelInfo(0, n));

    while (!queue.isEmpty()) {
      LevelInfo li = queue.poll();
      System.out.println("Level " + li.level + ":  " + li.node.getKey());

      if (li.node.getLeft() != null)
        queue.offer(new LevelInfo(li.level + 1, li.node.getLeft()));

      if (li.node.getRight() != null)
        queue.offer(new LevelInfo(li.level + 1, li.node.getRight()));
    }
  }

  // private boolean isBst(Node node, int min, int max) {
  // if (node == null)
  // return true;
  //
  // if (node.getKey() < min || node.getKey() > max)
  // return false;
  //
  // boolean status = true;
  // if (node.getLeft() != null){
  // status = isBst(node.getLeft(), node.getKey(), max);
  // }
  //
  // return isBst(node.getLeft(), no) && isBst(node.getRight());
  // }

  public boolean isBst() {
    lastKey = Integer.MIN_VALUE;
    return isBST2(root);
  }

  private int lastKey;

  private boolean isBst(Node node) {
    if (node == null)
      return true;

    boolean status = isBst(node.getLeft());
    status = status && (node.getKey() >= lastKey);
    lastKey = node.getKey();
    status = status && isBst(node.getRight());
    return status;
  }

  public boolean isBST2(Node node) {
    if (node == null)
      return true;

    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  boolean isBST(Node node, int min, int max) {
    if (node == null)
      return true;
    return ((node.getKey() >= min) && (node.getKey() <= max)
        && isBST(node.getLeft(), min, node.getKey()) && isBST(
          node.getRight(), node.getKey(), max));
  }
  
  private void modify(Node node){
    if (node == null)
      return;
    
    modify(node.getLeft());
    if (node.getLeft() != null){
      Node temp = node.getRight();
      node.setRight(node.getLeft());
      node.setLeft(null);
      
      while(node.getRight() != null)
        node =  node.getRight();
      
      node.setRight(temp);
    }
    modify(node.getRight());
  }
  
  public void rightTransform(){
    modify(root);
  }

  private class LevelInfo {
    int level;
    Node node;

    LevelInfo(int level, Node node) {
      this.level = level;
      this.node = node;
    }
  }
}
