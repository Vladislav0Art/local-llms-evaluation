package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansDecreasingPricesTest {

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, onlineStockSpan.calculateSpans(new int[]{5, 4, 3, 2, 1}));
    }

}