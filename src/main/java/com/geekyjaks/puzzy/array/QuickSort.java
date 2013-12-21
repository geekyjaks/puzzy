package com.geekyjaks.puzzy.array;

/**
 * Sorts the array using quick sort
 */
public class QuickSort {

  private int partition(int[] data, int start, int end) {

    int pivot = data[end];
    int position = start - 1;

    for (int index = start; index < end; index++) {
      if (data[index] < pivot) {
        position++;
        int temp = data[position];
        data[position] = data[index];
        data[index] = temp;
      }
    }

    position++;
    int temp = data[position];
    data[position] = data[end];
    data[end] = temp;

    return position;
  }

  public void sort(int[] data, int start, int end) {
    if (start < end) {
      int pivot = partition(data, start, end);
      sort(data, start, pivot - 1);
      sort(data, pivot + 1, end);
    }
  }
}
