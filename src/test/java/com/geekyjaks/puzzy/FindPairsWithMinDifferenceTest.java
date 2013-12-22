package com.geekyjaks.puzzy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.geekyjaks.puzzy.array.FindPairsWithMinDifference;
import com.geekyjaks.puzzy.model.Pair;

public class FindPairsWithMinDifferenceTest {

  @Test
  public void testNull() {
    FindPairsWithMinDifference fpwmd = new FindPairsWithMinDifference();
    assertNull(fpwmd.find(null));
  }

  @Test
  public void testLengthOne() {
    FindPairsWithMinDifference fpwmd = new FindPairsWithMinDifference();
    assertNull(fpwmd.find(new int[]{}));
  }
  
  @Test
  public void testOne() {
    FindPairsWithMinDifference fpwmd = new FindPairsWithMinDifference();
    List<Pair> result = new ArrayList<>();
    result.add(new Pair(-100, -90));
    result.add(new Pair(10, 20));
    assertEquals(result, fpwmd.find(new int[]{-100, 10, 20, -90, 40, 60, 100, 200}));
  }

}
