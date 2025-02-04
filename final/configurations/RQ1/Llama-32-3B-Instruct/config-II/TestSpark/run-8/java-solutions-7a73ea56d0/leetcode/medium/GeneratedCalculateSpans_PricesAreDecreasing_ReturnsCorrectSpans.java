package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_PricesAreDecreasing_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PricesAreDecreasing_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {120, 100, 80, 60};
        int[] expectedResult = {1, 2, 3, 4};
        assertArrayEquals(expectedResult, solution.calculateSpans(prices));
    }

}