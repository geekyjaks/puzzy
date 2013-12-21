package com.geekyjaks.puzzy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.geekyjaks.puzzy.linkedlist.LinkedList;

public class LinkedListTest {

  @Test
  public void testConstructor() {
    LinkedList ll = new LinkedList(1);
    assertEquals("Value not equals", ll.pretty(), "1");
  }

  @Test
  public void testAdd() {
    LinkedList ll = new LinkedList(1);
    ll.add(2);
    assertEquals("Value not equals", ll.pretty(), "1-2");
  }
}
