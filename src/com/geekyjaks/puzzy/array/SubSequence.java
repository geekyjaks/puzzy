package com.geekyjaks.puzzy.array;

import java.util.Stack;

/**
 * Solution to {@link http://www.careercup.com/question?id=3576940}. The time
 * complexity is O(n + m) where m < n. The space complexity O(m) where m < n.
 * The stack is popped up frequently, so it wont use much space.
 * 
 * @author geekyjaks
 */
public class SubSequence {

  public String get(String data) {
    if (data == null || data.length() <= 1)
      return null;

    int start = -1, end = -1;
    int tempStart = -1, tempEnd = data.length();
    // assume that first char is interested one
    char interested = data.charAt(0);
    // store position of 1s
    Stack<Integer> stack = new Stack<>();

    for (int index = 0; index < data.length(); index++) {
      if (data.charAt(index) == interested) {
        stack.push(index);
        if (tempStart == -1)
          tempStart = index;
      } else {
        if (tempStart == -1)
          continue;
        if (stack.isEmpty()) {
          if ((index - tempStart) > (end - start)) {
            start = tempStart;
            end = index;
          }
          tempStart = -1;
        } else
          // pop the matching 1
          stack.pop();
      }
    }

    // if the input itself is longest sequence, it should come here
    if (stack.isEmpty() && tempStart != -1) {
      if ((tempEnd - tempStart) > (end - start)) {
        start = tempStart;
        end = tempEnd;
      }
    }

    // if input has more 1s, stack is not empty
    while (!stack.isEmpty()) {
      tempStart = stack.pop();
      if ((tempEnd - tempStart) > (end - start)) {
        start = tempStart + 1;
        end = tempEnd;
      }
      tempEnd = tempStart;
    }

    return data.substring(start, end);
  }

  public static void main(String[] args) {
    SubSequence seq = new SubSequence();
    System.out.println(seq.get("111001110011100011100"));
  }
}
