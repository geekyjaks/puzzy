package com.geekyjaks.puzzy.string;

/**
 * Solution to {@link http://www.careercup.com/question?id=6047481959809024}.
 * The time complexity is O(2n) where n is length of input string.
 * The space complexity O(n).
 * 
 * @author geekyjaks
 */
public class ReverseSentence {

  public String get(String data) {
    if (data == null || data.length() <= 2)
      return data;

    char space = ' ';
    char[] src = data.toCharArray();
    char[] reversed = new char[data.length()];
    
    int pos = 0, end = data.length();
    
    for (int index = data.length() - 1; index >= 0; index--) {
      int start = -1;
      if (src[index] == space)
        // word starts next to space
        start = index + 1;
      else if (index == 0)
        start = 0;

      if (start != -1 && start <= end) {
        int len = end - start;
        // copy the word
        System.arraycopy(src, start, reversed, pos, len);
        end = index;
        pos += len;
        if (pos < data.length())
          // add space between words
          reversed[pos++] = space;
      }
    }
    return new String(reversed);
  }
}
