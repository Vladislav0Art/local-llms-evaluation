package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleElementsUnorderedTest {

    @Test
    public void calculateSpansMultipleElementsUnorderedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{60, 70, 80, 100, 90});
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 1}, result);
    }

}