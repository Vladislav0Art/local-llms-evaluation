package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithNegativePriceTest {

    @Test
    public void calculateSpansWithNegativePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {100, 80, 60, -70, 60, 75, 85};
        try {
            stockSpan.calculateSpans(input);
        } catch (IllegalArgumentException e) {
            assertEquals("Price should not be negative.", e.getMessage());
        }
    }

}