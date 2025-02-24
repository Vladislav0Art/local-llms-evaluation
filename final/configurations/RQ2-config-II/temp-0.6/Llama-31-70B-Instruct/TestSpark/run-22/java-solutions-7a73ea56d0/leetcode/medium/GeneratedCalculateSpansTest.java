package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] expectedSpans = onlineStockSpan.calculateSpans(prices);
        int[] actualSpans = {1, 1, 1, 2, 1, 4, 6};

        assertArrayEquals(expectedSpans, actualSpans);
    }

}