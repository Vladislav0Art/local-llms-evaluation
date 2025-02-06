package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStack();

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = stockSpan.calculateSpans(prices);
        assertResult(result, new int[]{1, 2, 1, 3, 4, 5});
    }

}