package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextAscInputTest {

    @Test
    public void nextAscInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(120);
        int nextResult = stockSpan.next(150);
        Assert.assertEquals(3, nextResult);
    }

}