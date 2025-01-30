package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleElementsOrderedTest {

    @Test
    public void calculateSpansMultipleElementsOrderedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{100, 80, 60, 40, 20});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}