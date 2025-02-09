package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextHigherValueTest {

    @Test
    public void nextHigherValueTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(7);
        Assert.assertEquals(2, stockSpan.next(8));
    }

}