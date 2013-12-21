package com.geekyjaks.puzzy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.geekyjaks.puzzy.array.FindNegativeSet;

public class FindNegativeSetTest {

  @Test
  public void testSimple() {
    int[] data = new int[] { 1, 2, 3, 4 };
    FindNegativeSet fns = new FindNegativeSet();
    assertArrayEquals("Values are not equal", fns.find(data),
        new int[] { 1, 4 });
  }

  @Test
  public void testNegative() {
    int[] data = new int[] { 1, 2, 3, 4, 5 };
    FindNegativeSet fns = new FindNegativeSet();
    assertArrayEquals("Values are not equal", fns.find(data), new int[] {});
  }

  @Test
  public void testOne() {
    int[] data = new int[] { 1, 2, 3, 4, 5, 8, 9 };
    FindNegativeSet fns = new FindNegativeSet();
    assertArrayEquals("Values are not equal", fns.find(data), new int[] { 2, 5,
        9 });
  }

  @Test
  public void testTwo() {
    int[] data = new int[] { 9, 11, 15, 13 };
    FindNegativeSet fns = new FindNegativeSet();
    assertArrayEquals("Values are not equal", fns.find(data),
        new int[] { 9, 15 });
  }
}
