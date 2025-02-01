package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{100});
        Assert.assertArrayEquals(new int[]{1}, spans);
    }

}