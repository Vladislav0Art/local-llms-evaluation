package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultipleValuesTest {

    @Test
    public void nextMultipleValuesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(200);
        Assert.assertEquals(2, result);
    }

}