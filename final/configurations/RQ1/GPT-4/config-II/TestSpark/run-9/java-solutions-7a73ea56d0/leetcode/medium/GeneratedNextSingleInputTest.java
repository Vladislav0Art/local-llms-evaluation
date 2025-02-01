package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextSingleInputTest {

    @Test
    public void nextSingleInputTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int count = onlineStockSpan.next(100);
        Assert.assertEquals(1, count);
    }

}