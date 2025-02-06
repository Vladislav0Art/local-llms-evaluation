package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpansForPricesWithOneElement_WhenInputArrayContainsOnlyOneElement_ReturnsCorrectResult {

    @Test
    public void calculateSpansForPricesWithOneElement_WhenInputArrayContainsOnlyOneElement_ReturnsCorrectResult() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10};

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertEquals(1, result[0]);
    }

}