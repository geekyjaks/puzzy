package com.geekyjaks.puzzy.array;

/**
 * Solution to {@link http://www.careercup.com/question?id=5729537878917120}.
 * Finds the pair(x, y) which has minimum difference.
 * 
 * @author geekyjaks
 */
public class FindMinDiffPair {

  public int[] find(int[] a, int[] b) {

    if (a == null || b == null || a.length == 0 || b.length == 0)
      return null;

    int min = Integer.MAX_VALUE;
    int i, j;
    int x, y;

    QuickSort.sort(a);
    QuickSort.sort(b);

    i = j = 0;
    x = y = Integer.MIN_VALUE;

    while (i < a.length && j < b.length) {
      if (a[i] - b[j] == 0) {
        x = y = a[i];
        break;
      }

      if (Math.abs(a[i] - b[j]) < min) {
        x = a[i];
        y = b[j];
        min = Math.abs(x - y);
      }

      if (a[i] < b[j])
        i++;
      else
        j++;
    }

    return new int[] { x, y };
  }
}
