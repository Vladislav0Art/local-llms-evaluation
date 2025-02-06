package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCalculateSpans_SinglePrice_ReturnsArrayWithOneElement {

    @Test
    public void calculateSpans_SinglePrice_ReturnsArrayWithOneElement() {
        int[] prices = {1};
        int[] result = new OnlineStockSpan().calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}