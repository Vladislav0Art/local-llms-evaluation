package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleElementsTest {

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, spans);
    }

}