package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDecreasingPriceTest {

    @Test
    public void calculateSpansDecreasingPriceTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{500, 400, 300, 200, 100};
        int[] result = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}