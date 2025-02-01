package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultipleInputIncreasingTest {

    @Test
    public void nextMultipleInputIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int count = onlineStockSpan.next(120);
        Assert.assertEquals(2, count);
    }

}