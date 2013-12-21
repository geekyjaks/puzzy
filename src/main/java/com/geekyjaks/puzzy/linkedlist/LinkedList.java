package com.geekyjaks.puzzy.linkedlist;

/**
 * Represents a Linked List and its basic functionalities
 * 
 * @author geekyjaks
 */
public class LinkedList {

  private Node head;
  
  public LinkedList(int data){
    head = new Node(data);
  }
  
  public Node head(){
    return head;
  }
  
  public void setHead(Node head){
    this.head = head;
  }
  
  public void add(int data){
    Node temp = new Node(data);
    Node node = head;
    while(node.next() != null){
      node = node.next(); 
    }
    
    node.setNext(temp);
  }
  
  public String pretty(){
    Node node = head;
    StringBuffer sb = new StringBuffer(String.valueOf(head.data()));
    while(node.next() != null){
      node = node.next();
      sb.append("-");
      sb.append(String.valueOf(node.data()));
    }
    return sb.toString();
  }
}
