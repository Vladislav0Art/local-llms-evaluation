package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllSamePricesTest {

    @Test
    public void calculateSpansAllSamePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, onlineStockSpan.calculateSpans(new int[]{100, 100, 100, 100, 100}));
    }

}