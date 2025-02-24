package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpans4Test {

    @Test
    public void calculateSpans4Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(new int[]{1, 2, 2, 1}, stockSpan.calculateSpans(new int[]{1, 2, 3, 1}));
    }

}