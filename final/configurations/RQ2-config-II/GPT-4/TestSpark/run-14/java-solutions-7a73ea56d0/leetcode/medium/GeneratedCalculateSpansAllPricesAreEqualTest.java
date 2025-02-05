package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllPricesAreEqualTest {

    @Test
    public void calculateSpansAllPricesAreEqualTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {4, 4, 4, 4};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        int[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, actual);
    }

}