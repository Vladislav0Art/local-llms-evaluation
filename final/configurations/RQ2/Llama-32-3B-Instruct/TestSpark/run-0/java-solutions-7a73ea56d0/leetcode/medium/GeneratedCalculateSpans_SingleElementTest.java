package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_SingleElementTest {

    @Test
    public void calculateSpans_SingleElementTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}