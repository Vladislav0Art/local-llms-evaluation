package leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        int[] prices = {10, 4, 5, 90, 120, 80};
        int[] spans = {1, 1, 2, 4, 5, 1};
        OnlineStockSpan stock = new OnlineStockSpan();
        assertArrayEquals(spans, stock.calculateSpans(prices));
    }

}