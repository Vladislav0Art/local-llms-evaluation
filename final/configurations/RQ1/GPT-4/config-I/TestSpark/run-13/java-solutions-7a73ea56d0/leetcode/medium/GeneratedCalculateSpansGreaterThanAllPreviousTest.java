package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansGreaterThanAllPreviousTest {

    @Test
    public void calculateSpansGreaterThanAllPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100, 110, 120});
        assertArrayEquals(new int[]{1, 2, 3}, spans);
    }

}