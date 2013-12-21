package com.geekyjaks.puzzy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.geekyjaks.puzzy.string.ReverseSentence;

public class ReverseSentenceTest {

  @Test
  public void testNull() {
    ReverseSentence rs = new ReverseSentence();
    assertNull("Null is not returned", rs.get(null));
  }

  @Test
  public void testEmpty() {
    ReverseSentence rs = new ReverseSentence();
    assertEquals("Empty string is not returned", rs.get(""), "");
  }

  @Test
  public void testLesserSize() {
    ReverseSentence rs = new ReverseSentence();
    assertEquals("Values are not equal", rs.get("a "), "a ");
  }

  @Test
  public void testReverse() {
    ReverseSentence rs = new ReverseSentence();
    assertEquals("Values are not equal", rs.get("repeat these words"), "words these repeat");
  }

  @Test
  public void testMoreSpaces() {
    ReverseSentence rs = new ReverseSentence();
    assertEquals("Values are not equal", rs.get("repeat these  words"), "words  these repeat");
  }
}
