package com.geekyjaks.puzzy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.geekyjaks.puzzy.array.FindPairWithDifference;

public class FindPairWithDifferenceTest {

  @Test
  public void testOne() {
    int[] data = new int[] { 1, 2, 3, 4, 5 };
    FindPairWithDifference fpwd = new FindPairWithDifference();
    assertEquals(fpwd.find(data, 1), 4);
  }

  @Test
  public void testTwo() {
    int[] data = new int[] { 1, 2, 3, 4, 5, 7, 10, 12 };
    FindPairWithDifference fpwd = new FindPairWithDifference();
    assertEquals(fpwd.find(data, 2), 5);
  }
}
