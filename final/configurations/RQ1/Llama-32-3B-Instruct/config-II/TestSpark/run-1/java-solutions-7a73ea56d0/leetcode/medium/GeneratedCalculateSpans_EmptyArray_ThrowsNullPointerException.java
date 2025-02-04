package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_EmptyArray_ThrowsNullPointerException {

    @Test
    public void calculateSpans_EmptyArray_ThrowsNullPointerException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        assertThrows(NullPointerException.class, () -> onlineStockSpan.calculateSpans(prices));
    }

}