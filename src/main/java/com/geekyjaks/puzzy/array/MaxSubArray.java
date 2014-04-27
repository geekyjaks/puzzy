package com.geekyjaks.puzzy.array;

public class MaxSubArray {

  private static class SubArray {
    int start;
    int end;
    int sum;

    SubArray(int start, int end, int sum) {
      this.start = start;
      this.end = end;
      this.sum = sum;
    }
  }

  private SubArray findMaxCrossingSubArray(int[] data, int start, int mid,
      int end) {
    int sum = 0;
    int leftSum = Integer.MIN_VALUE;
    int maxLeft = mid;
    for (int index = mid; index >= start; index--) {
      sum += data[index];
      if (leftSum < sum) {
        leftSum = sum;
        maxLeft = index;
      }
    }

    int rightSum = Integer.MIN_VALUE;
    int maxRight = mid + 1;
    sum = 0;
    for (int index = mid + 1; index <= end; index++) {
      sum += data[index];
      if (rightSum < sum) {
        rightSum = sum;
        maxRight = index;
      }
    }

    return new SubArray(maxLeft, maxRight, leftSum + rightSum);
  }

  public SubArray findMaxSubArray(int[] data, int start, int end) {

    if (start == end)
      return new SubArray(start, end, data[start]);

    int mid = (start + end) / 2;
    SubArray ls = findMaxSubArray(data, start, mid);
    SubArray rs = findMaxSubArray(data, mid + 1, end);
    SubArray mcs = findMaxCrossingSubArray(data, start, mid, end);

    if (ls.sum >= rs.sum && ls.sum >= mcs.sum)
      return ls;
    else if (rs.sum >= ls.sum && rs.sum >= mcs.sum)
      return rs;
    else return mcs;
  }

  public static void main(String[] args) {

    int[] data = { -9, 3, 3, 4, 3, -7, -5, 1, -2, 5, 4, 2, -5, 4 };
    MaxSubArray msa = new MaxSubArray();
    SubArray sa = msa.findMaxSubArray(data, 0, data.length - 1);
    System.out.println("Start: " + sa.start + ", End: " + sa.end + ", Sum: "
        + sa.sum);
  }
}
