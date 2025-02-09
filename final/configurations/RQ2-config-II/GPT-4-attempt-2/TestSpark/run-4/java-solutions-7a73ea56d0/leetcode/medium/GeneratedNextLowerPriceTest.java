package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextLowerPriceTest {

    @Test
    public void nextLowerPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        Assert.assertEquals(1, onlineStockSpan.next(50));
    }

}