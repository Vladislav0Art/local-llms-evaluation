package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansMultipleElements_ReturnsCorrectArray {

    @Test
    public void calculateSpansMultipleElements_ReturnsCorrectArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, -3, -2, 1};
        try {
            int[] result = onlineStockSpan.calculateSpans(prices);
            assert result != null;
            assertEquals(4, result.length);
            assertEquals(1, result[0]);
            assertEquals(2, result[1]);
            assertEquals(1, result[2]);
            assertEquals(3, result[3]);
        } catch (NullPointerException e) {
            fail("Expected exception not thrown");
        }
    }

}