package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_SingleElementReturnOneSpan {

    private OnlineStockSpan stockSpan = new OnlineStack();

    @Test
    public void calculateSpans_SingleElementReturnOneSpan() {
        int[] prices = {1};
        int[] result = stockSpan.calculateSpans(prices);
        assertResult(result, new int[]{1});
    }

}