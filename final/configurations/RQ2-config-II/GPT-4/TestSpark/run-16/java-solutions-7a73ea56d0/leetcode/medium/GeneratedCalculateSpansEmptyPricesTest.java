package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansEmptyPricesTest {

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] response = onlineStockSpan.calculateSpans(new int[]{});
        Assert.assertArrayEquals(new int[]{}, response);
    }

}