package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultipleInputTest {

    @Test
    public void nextMultipleInputTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int count = onlineStockSpan.next(80);
        Assert.assertEquals(1, count);
    }

}