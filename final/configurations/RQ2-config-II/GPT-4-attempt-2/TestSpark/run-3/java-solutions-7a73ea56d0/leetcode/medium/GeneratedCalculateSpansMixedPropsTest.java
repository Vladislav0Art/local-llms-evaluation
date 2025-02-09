package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCalculateSpansMixedPropsTest {

    @Test
    public void calculateSpansMixedPropsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{1, 1, 2, 3, 1}, onlineStockSpan.calculateSpans(new int[]{30, 20, 30, 40, 10}));
    }

}