package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextExistingPriceTest {

    @Test
    public void nextExistingPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int response = onlineStockSpan.next(100);
        Assert.assertEquals(2, response);
    }

}