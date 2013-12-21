package com.geekyjaks.puzzy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.geekyjaks.puzzy.linkedlist.LinkedList;
import com.geekyjaks.puzzy.linkedlist.ReverseLinkedList;

public class ReverseLinkedListTest {

  @Test
  public void test() {
    LinkedList ll = new LinkedList(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ReverseLinkedList rll = new ReverseLinkedList();
    rll.reverse(ll);
    assertEquals("Value not equals", ll.pretty(), "5-4-3-2-1");
  }
}
