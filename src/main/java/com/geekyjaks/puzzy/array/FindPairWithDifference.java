package com.geekyjaks.puzzy.array;

/**
 * Find pairs with difference K. Solution to {@link http
 * ://www.careercup.com/question?id=6229237509914624}
 * 
 * @author geekyjaks
 */
public class FindPairWithDifference {

  public int find(int[] data, int diff) {

    QuickSort.sort(data, 0, data.length - 1);

    int count = 0;
    int end = data.length - 1;
    int start = end - 1;

    while (start < end) {
      if (data[end] - data[start] == diff)
        count++;

      if (data[end] - data[start] >= diff)
        end--;

      start--;
      if (start < 0)
        break;
    }

    return count;
  }
}
