package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementArrayTest {

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, spans);
    }

}