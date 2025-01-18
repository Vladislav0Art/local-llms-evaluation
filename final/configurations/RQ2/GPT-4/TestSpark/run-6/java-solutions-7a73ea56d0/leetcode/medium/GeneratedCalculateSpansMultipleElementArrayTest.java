package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleElementArrayTest {

    @Test
    public void calculateSpansMultipleElementArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 80, 60});
        Assert.assertEquals(3, result.length);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(1, result[1]);
        Assert.assertEquals(1, result[2]);
    }

}