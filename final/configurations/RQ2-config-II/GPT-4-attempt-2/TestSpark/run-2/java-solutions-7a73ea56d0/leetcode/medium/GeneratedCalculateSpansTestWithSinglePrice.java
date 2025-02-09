package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTestWithSinglePrice {

    @Test
    public void calculateSpansTestWithSinglePrice() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{100});
        Assert.assertArrayEquals(new int[]{1}, result);
    }

}