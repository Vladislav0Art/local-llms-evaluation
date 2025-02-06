package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpansForPricesWithMultipleElements_WhenInputArrayContainsMultipleElements_ReturnsCorrectResult {

    @Test
    public void calculateSpansForPricesWithMultipleElements_WhenInputArrayContainsMultipleElements_ReturnsCorrectResult() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertEquals(6, result.length);
    }

}