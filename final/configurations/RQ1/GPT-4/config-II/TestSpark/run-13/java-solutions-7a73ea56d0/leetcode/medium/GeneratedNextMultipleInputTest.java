package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultipleInputTest {

    @Test
    public void nextMultipleInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int nextResult = stockSpan.next(80);
        Assert.assertEquals(1, nextResult);
    }

}