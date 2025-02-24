package leetcode.medium;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        Assert.assertEquals(span.next(10), 1);
        Assert.assertEquals(span.next(5), 1);
    }

}