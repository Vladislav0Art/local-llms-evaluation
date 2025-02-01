package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllElementsDecreasingTest {

    @Test
    public void calculateSpansAllElementsDecreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{50, 40, 30, 20, 10});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, spans);
    }

}