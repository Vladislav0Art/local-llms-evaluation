package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansDecreasingValuesTest {

    @Test
    public void calculateSpansDecreasingValuesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, stockSpan.calculateSpans(new int[]{4, 3, 2, 1}));
    }

}