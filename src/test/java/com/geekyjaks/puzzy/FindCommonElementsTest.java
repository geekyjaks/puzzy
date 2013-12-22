package com.geekyjaks.puzzy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.geekyjaks.puzzy.array.FindCommonElements;

public class FindCommonElementsTest {

  @Test
  public void testNull() {
    FindCommonElements fce = new FindCommonElements();
    assertNull(fce.find(new int[] {}, null));
  }

  @Test
  public void testNoCommon() {
    FindCommonElements fce = new FindCommonElements();
    assertEquals(0, fce.find(new int[] { 1, 2 }, new int[] { 3, 4 }).size());
  }

  @Test
  public void testCommon() {
    FindCommonElements fce = new FindCommonElements();
    assertEquals(
        3,
        fce.find(new int[] { 1, 3, 5, 7, 9, 11, 13, 25 },
            new int[] { 2, 4, 6, 7, 10, 11, 15, 17, 25 }).size());
  }
}
