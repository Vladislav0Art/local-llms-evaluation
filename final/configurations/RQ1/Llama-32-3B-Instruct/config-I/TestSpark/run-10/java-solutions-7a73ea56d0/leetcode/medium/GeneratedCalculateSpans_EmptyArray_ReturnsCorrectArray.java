package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedCalculateSpans_EmptyArray_ReturnsCorrectArray {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArray_ReturnsCorrectArray() {
        // given
        int[] prices = {};

        // when
        int[] spans = stockSpan.calculateSpans(prices);

        // then
        assertNull(spans);
    }

}