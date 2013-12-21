package com.geekyjaks.puzzy.linkedlist;

/**
 * Reverses a Linked List
 * 
 * @author geekyjaks
 */
public class ReverseLinkedList {

  public LinkedList reverse(LinkedList list) {
    Node current = list.head();
    Node next = current.next();

    while (next != null) {
      Node temp = next.next();
      next.setNext(current);
      current = next;
      next = temp;
    }
    // Set old head->next = null
    list.head().setNext(null);
    
    list.setHead(current);
    return list;
  }
}
