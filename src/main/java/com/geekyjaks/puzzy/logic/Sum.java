package com.geekyjaks.puzzy.logic;

public class Sum {

  public static void main(String[] args) {

    int n = 10;
    int[] data = { 1, 2, 3, 5, 6, 8, 9, 10 };

    int sum = 0;
    for (int i = 0; i < data.length; i++)
      sum += data[i];

    int difference = n * (n + 1) / 2 - sum;
    int bit = difference & ~(difference - 1);

    System.out.println("Differece: " + difference + ", bit: " + bit);
    int x = 0, y = 0;
    for (int i = 0; i < data.length; i++) {
      if ((data[i] & bit) == 1)
        x = x ^ data[i];
      else
        y = y ^ data[i];
    }
    
    for (int i = 1; i <= n; i++) {
      if ((i & bit) == 1)
        x = x ^ i;
      else
        y = y ^ i;
    }

    System.out.println("x: " + x + ", y: " + y);
  }
}
