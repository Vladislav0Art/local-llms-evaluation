package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(10);
        stock.next(20);
        stock.next(30);
        Assert.assertEquals(3, stock.next(40));
    }

}