package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextSamePricesTest {

    @Test
    public void nextSamePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        Assert.assertEquals(2, onlineStockSpan.next(100));
    }

}