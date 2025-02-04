package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_PricesAreIncreasing_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PricesAreIncreasing_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 120};
        int[] expectedResult = {1, 2, 3, 4};
        assertArrayEquals(expectedResult, solution.calculateSpans(prices));
    }

}