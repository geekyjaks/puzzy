package com.geekyjaks.puzzy.array;

import java.util.ArrayList;
import java.util.List;

import com.geekyjaks.puzzy.model.Pair;

/**
 * Solution to {@link http://www.careercup.com/question?id=4821862626361344}.
 * Finds the pairs which has minimum difference.
 * 
 * @author geekyjaks
 */
public class FindPairsWithMinDifference {

  public List<Pair> find(int[] data) {

    if (data == null || data.length <= 1)
      return null;

    List<Pair> result = new ArrayList<>();

    int min = Integer.MAX_VALUE;
    int start, end;

    start = 0;
    end = start + 1;

    QuickSort.sort(data, 0, data.length - 1);

    while (end < data.length) {
      if (data[end] - data[start] < min) {
        min = data[end] - data[start];
        result.clear();
      }

      if (data[end] - data[start] <= min)
        result.add(new Pair(data[start], data[end]));

      start++;
      end++;
    }

    return result;
  }
}
