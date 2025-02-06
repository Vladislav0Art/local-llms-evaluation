package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementReturnOneSpan {

    @Test
    public void calculateSpans_SingleElementReturnOneSpan() {
        int[] prices = {1};
        int[] result = new OnlineStockSpan().calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}