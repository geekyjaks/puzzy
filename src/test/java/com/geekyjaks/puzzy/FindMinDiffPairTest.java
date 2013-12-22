package com.geekyjaks.puzzy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.geekyjaks.puzzy.array.FindMinDiffPair;

public class FindMinDiffPairTest {

  @Test
  public void testNull() {
    FindMinDiffPair fmdp = new FindMinDiffPair();
    assertNull(fmdp.find(new int[] { 1 }, null));
  }

  @Test
  public void testEmpty() {
    FindMinDiffPair fmdp = new FindMinDiffPair();
    assertNull(fmdp.find(new int[] {}, new int[] {}));
  }

  @Test
  public void testOne() {
    FindMinDiffPair fmdp = new FindMinDiffPair();
    assertArrayEquals(
        fmdp.find(new int[] { -100, -50, 9, 17, 28 }, new int[] { -70, -30, 3,
            13, 20, 40 }), new int[] { 17, 20 });
  }

}
