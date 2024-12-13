package com.csc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {


  Calculator calculator;

  @BeforeEach
  void setUp() {

    calculator = new Calculator();
    
  }

  @Test
  void testMaximumUsingForLoop() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(5, calculator.maximumUsingForLoop(nums));
  }

  @Test
  void testMinimumUsingForLoop() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(1, calculator.minimumUsingForLoop(nums));
  }

  @Test
  void testSumUsingForLoop() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(15, calculator.sumUsingForLoop(nums));
  }

  @Test
  void testAverageUsingForLoop() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(3.0, calculator.averageUsingForLoop(nums), 0.001);
  }

  @Test
  void testMaximumUsingStream() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(5, calculator.maximumUsingStream(nums));
  }

  @Test
  void testMinimumUsingStream() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(1, calculator.minimumUsingStream(nums));
  }

  @Test
  void testSumUsingStream() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(15, calculator.sumUsingStream(nums));
  }

  @Test
  void testAverageUsingStream() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(3.0, calculator.averageUsingStream(nums), 0.001);
  }

  @Test
  void testEvensOnly() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    int[] expected = {2, 4, 6};
    assertArrayEquals(expected, calculator.evensOnly(nums));
  }

  @Test
  void testOddsOnly() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    int[] expected = {1, 3, 5};
    assertArrayEquals(expected, calculator.oddsOnly(nums));
  }

  @Test
  void testAddFive() {
    int[] nums = {1, 2, 3, 4, 5};
    int[] expected = {6, 7, 8, 9, 10};
    assertArrayEquals(expected, calculator.addFive(nums));
  }

  @Test
  void testSquareNumbers() {
    int[] nums = {1, 2, 3, 4, 5};
    int[] expected = {1, 4, 9, 16, 25};
    assertArrayEquals(expected, calculator.squareNumbers(nums));
  }
  
}
