package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] expected = {2, 4, 3, 4, 5, 6};
        int[] result = new OnlineStockSpan().calculateSpans(prices);
        assert Arrays.equals(expected, result);
    }

}