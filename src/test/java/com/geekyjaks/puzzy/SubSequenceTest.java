package com.geekyjaks.puzzy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.geekyjaks.puzzy.array.SubSequence;

public class SubSequenceTest {

  @Test
  public void testNull() {
    SubSequence ss = new SubSequence();
    assertNull("Null is not returned", ss.get(null));
  }

  @Test
  public void testEmpty() {
    SubSequence ss = new SubSequence();
    assertNull("Null is not returned", ss.get(""));
  }

  @Test
  public void testLengthOne() {
    SubSequence ss = new SubSequence();
    assertNull("Null is not returned", ss.get("1"));
  }

  @Test
  public void testFullLength() {
    SubSequence ss = new SubSequence();
    assertEquals("Values are not equal", ss.get("1010101010"), "1010101010");
  }

  @Test
  public void testMoreOnes() {
    SubSequence ss = new SubSequence();
    assertEquals("Values are not equal", ss.get("1110111011111"), "10");
  }
  
  @Test
  public void testMoreZeros() {
    SubSequence ss = new SubSequence();
    assertEquals("Values are not equal", ss.get("1000111000000111011111"), "111000");
  }
}
