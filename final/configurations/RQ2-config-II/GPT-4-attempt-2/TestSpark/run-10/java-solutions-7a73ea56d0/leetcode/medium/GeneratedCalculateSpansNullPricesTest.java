package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansNullPricesTest {

    @Test
    public void calculateSpansNullPricesTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = null;
        try {
            obj.calculateSpans(prices);
            Assert.fail("Should have thrown an exception for null prices array.");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Prices cannot be null.", e.getMessage());
        }
    }

}