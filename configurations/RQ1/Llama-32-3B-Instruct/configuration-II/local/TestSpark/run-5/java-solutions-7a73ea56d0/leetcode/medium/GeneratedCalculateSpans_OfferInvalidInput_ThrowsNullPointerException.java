package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_OfferInvalidInput_ThrowsNullPointerException {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_OfferInvalidInput_ThrowsNullPointerException() {
        int[] prices = null;
        try {
            onlineStockSpan.calculateSpans(prices);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}