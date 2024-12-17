package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSpans_NullPricesArray {

    private OnlineStockSpan onLineStockSpan = new OnlineStockSpan();

    @Test
    public void testCalculateSpans_NullPricesArray() {
        int[] prices = null;
        try {
            onlineStockSpan.list = new ArrayList<>();
            onLineStockSpan.calculateSpans(prices);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}