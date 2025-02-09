package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMixedPricesTest {

    @Test
    public void calculateSpansMixedPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{1, 1, 3, 1, 5}, onlineStockSpan.calculateSpans(new int[]{100, 50, 150, 100, 200}));
    }

}