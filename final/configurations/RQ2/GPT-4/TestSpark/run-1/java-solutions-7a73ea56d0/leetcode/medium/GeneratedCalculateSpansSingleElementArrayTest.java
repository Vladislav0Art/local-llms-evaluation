package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementArrayTest {

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{100};
        int[] result = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}