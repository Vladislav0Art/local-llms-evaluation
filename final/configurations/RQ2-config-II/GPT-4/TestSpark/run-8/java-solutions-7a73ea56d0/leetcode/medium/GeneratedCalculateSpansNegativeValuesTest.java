package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansNegativeValuesTest {

    @Test
    public void calculateSpansNegativeValuesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        try {
            int[] prices = {100, -1, 60, 70, 60, 75, 85};
            stockSpan.calculateSpans(prices);
        } catch (IllegalArgumentException e) {
            assertEquals("Price can not be negative", e.getMessage());
        }
    }

}