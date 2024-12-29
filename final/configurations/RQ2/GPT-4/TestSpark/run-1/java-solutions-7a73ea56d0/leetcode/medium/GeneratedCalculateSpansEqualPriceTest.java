package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEqualPriceTest {

    @Test
    public void calculateSpansEqualPriceTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{100, 100, 100, 100, 100};
        int[] result = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}