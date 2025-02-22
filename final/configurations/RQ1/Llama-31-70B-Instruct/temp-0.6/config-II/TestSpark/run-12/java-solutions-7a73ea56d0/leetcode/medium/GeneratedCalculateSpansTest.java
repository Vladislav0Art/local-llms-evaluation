package leetcode.medium;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class GeneratedCalculateSpansTest {

    private OnlineStockSpan stockSpan;

    @Test
    public void calculateSpansTest() {
        stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

}