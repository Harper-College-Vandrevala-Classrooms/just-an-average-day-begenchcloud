package com.csc;

import java.util.Arrays;

public class Calculator {


  public int maximumUsingForLoop(int[] nums) {
    int max = Integer.MIN_VALUE;
    
    for (int num : nums) {
      if (num > max) {
        max = num;
      }
    }

    return max;
  }

  public int minimumUsingForLoop(int[] nums) {
    int min = Integer.MAX_VALUE;

      for (int num : nums) {
        if (num < min) {
          min = num;
        }
    }

    return min;
  }

  public int sumUsingForLoop(int[] nums) {
    int sum = 0;

    for (int num : nums) {
        sum += num;
    }

    return sum;
  }

  public double averageUsingForLoop(int[] nums) {
    return (double) sumUsingForLoop(nums) / nums.length;
  }


  public int maximumUsingStream(int[] nums) {
    return Arrays.stream(nums).max().orElseThrow();
  }

  public int minimumUsingStream(int[] nums) {
    return Arrays.stream(nums).min().orElseThrow();
  }

  public int sumUsingStream(int[] nums) {
    return Arrays.stream(nums).sum();
  }

  public double averageUsingStream(int[] nums) {
    return Arrays.stream(nums).average().orElseThrow();
  }

  public int[] evensOnly(int[] nums) {
    return Arrays.stream(nums).filter(num -> num % 2 == 0).toArray();
}

public int[] oddsOnly(int[] nums) {
    return Arrays.stream(nums).filter(num -> num % 2 != 0).toArray();
}

public int[] addFive(int[] nums) {
    return Arrays.stream(nums).map(num -> num + 5).toArray();
}

public int[] squareNumbers(int[] nums) {
    return Arrays.stream(nums).map(num -> num * num).toArray();
}
  
}
