package com.geekyjaks.puzzy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution to {@link http://www.careercup.com/question?id=4821862626361344}.
 * Finds common elements in two array.
 * 
 * @author geekyjaks
 */
public class FindCommonElements {

  public List<Integer> find(int[] a, int[] b) {

    if (a == null || b == null)
      return null;

    List<Integer> result = new ArrayList<>();

    int i, j;
    i = j = 0;

    QuickSort.sort(a);
    QuickSort.sort(b);

    while (i < a.length && j < b.length) {
      if (a[i] == b[j]) {
        result.add(a[i]);
        i++;
        j++;
      } else if (a[i] < b[j])
        i++;
      else
        j++;
    }
    return result;
  }
}
