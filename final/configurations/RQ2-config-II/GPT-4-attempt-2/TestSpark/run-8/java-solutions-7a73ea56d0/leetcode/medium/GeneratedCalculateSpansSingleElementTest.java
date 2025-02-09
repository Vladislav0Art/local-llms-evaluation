package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan onSpan = new OnlineStockSpan();
        int[] prices = new int[]{100};
        int[] result = onSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}