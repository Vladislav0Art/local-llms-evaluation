package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextDescInputTest {

    @Test
    public void nextDescInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(150);
        stockSpan.next(130);
        int nextResult = stockSpan.next(110);
        Assert.assertEquals(1, nextResult);
    }

}