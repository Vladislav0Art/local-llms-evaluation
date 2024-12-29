package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansIncreasingPriceTest {

    @Test
    public void calculateSpansIncreasingPriceTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{100, 200, 300, 400, 500};
        int[] result = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}