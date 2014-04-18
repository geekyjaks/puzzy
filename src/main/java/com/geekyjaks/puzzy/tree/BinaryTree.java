package com.geekyjaks.puzzy.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTree {

  private Node root;

  public BinaryTree(Node root) {
    this.root = root;
  }
  
  private void inorder(Node node){
    if (node == null)
      return;
    
    inorder(node.getLeft());
    System.out.print("->" + node.getKey());
    inorder(node.getRight());
  }

  public void printInorder(){
    inorder(root);
  }

  private void preOrder(Node node){
    if (node == null)
      return;
    
    System.out.print("->" + node.getKey());
    preOrder(node.getLeft());
    preOrder(node.getRight());
  }

  public void printPreorder(){
    preOrder(root);
  }
  
  private void postOrder(Node node){
    if (node == null)
      return;
    
    postOrder(node.getLeft());
    postOrder(node.getRight());
    System.out.print("->" + node.getKey());
  }

  public void printPostorder(){
    postOrder(root);
  }
  
  public int height(){
    return height(root);
  }
  
  private int height(Node node){
    
    if (node == null)
      return -1;
    
    int l = 1 + height(node.getLeft());
    int r = 1 + height(node.getRight());
    
    if (l >= r)
      return l;
    
    return r;
  }
  
  public void levelOrder(){
    Node n = root;
    Queue<LevelInfo> queue = new LinkedBlockingQueue<LevelInfo>();
    queue.offer(new LevelInfo(0, n));
    
    while(!queue.isEmpty()){
      LevelInfo li = queue.poll();
      System.out.println("Level " + li.level + ":  " +  li.node.getKey());
      
      if (li.node.getLeft() != null)
        queue.offer(new LevelInfo(li.level + 1, li.node.getLeft()));
      
      if (li.node.getRight() != null)
        queue.offer(new LevelInfo(li.level + 1, li.node.getRight()));
    }
  }
  
  private boolean isBst(Node node){
    if (node == null)
      return true;
    
    if((node.getLeft() == null || node.getLeft().getKey() <= node.getKey()) && (node.getRight() == null || node.getRight().getKey() >= node.getKey()))
      return isBst(node.getLeft()) && isBst(node.getRight());
    
    return false;
  }
  
  public boolean isBst(){
    return isBst(root);
  }
  
  private class LevelInfo{
    int level;
    Node node;
    
    LevelInfo(int level, Node node){
      this.level = level;
      this.node = node;
    }
  }
}
