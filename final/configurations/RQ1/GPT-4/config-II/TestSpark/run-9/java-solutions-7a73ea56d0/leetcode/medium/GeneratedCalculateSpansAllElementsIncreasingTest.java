package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllElementsIncreasingTest {

    @Test
    public void calculateSpansAllElementsIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{10, 20, 30, 40, 50});
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, spans);
    }

}