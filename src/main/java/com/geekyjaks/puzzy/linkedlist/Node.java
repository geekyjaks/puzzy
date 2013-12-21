package com.geekyjaks.puzzy.linkedlist;

public class Node {

  private int data;
  private Node next;
  
  public Node(int data) {
    this(data, null);
  }
  
  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public int data() {
    return data;
  }
  
  public void setData(int data) {
    this.data = data;
  }
  
  public Node next() {
    return next;
  }
  
  public void setNext(Node next) {
    this.next = next;
  }
}
