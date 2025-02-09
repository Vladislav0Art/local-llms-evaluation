package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansEmptyTest {

    @Test
    public void calculateSpansEmptyTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{});
        Assert.assertArrayEquals(new int[]{}, result);
    }

}