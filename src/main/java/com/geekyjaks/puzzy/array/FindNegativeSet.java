package com.geekyjaks.puzzy.array;

import java.util.Stack;

public class FindNegativeSet {

  public int[] find(int[] data) {

    int sum = 0;
    for (int index = 0; index < data.length; index++)
      sum += data[index];

    if (sum % 2 == 1)
      return new int[] {};

    QuickSort qs = new QuickSort();
    qs.sort(data, 0, data.length - 1);

    Stack<Integer> stack = new Stack<>();
    int negsum = 0;
    sum /= 2;
    for (int index = data.length - 1; index >= 0; index--) {
      if (negsum + data[index] == sum) {
        stack.push(data[index]);
        return stackToArray(stack);
      } else if (negsum + data[index] < sum) {
        stack.push(data[index]);
        negsum += data[index];
      }
    }

    return new int[] {};
  }

  private int[] stackToArray(Stack<Integer> stack) {
    if (stack.isEmpty())
      return new int[] {};
    int[] array = new int[stack.size()];
    int index = 0;
    while (!stack.isEmpty()) {
      array[index++] = stack.pop();
    }
    return array;
  }
}
