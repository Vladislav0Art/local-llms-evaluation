package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSpans_EmptyPricesArray {

    private OnlineStockSpan onLineStockSpan = new OnlineStockSpan();

    @Test
    public void testCalculateSpans_EmptyPricesArray() {
        try {
            onlineStockSpan.list = new ArrayList<>();
            onLineStockSpan.calculateSpans(new int[]{});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}