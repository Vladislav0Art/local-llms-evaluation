package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansFirstElementTest {

    @Test
    public void calculateSpansFirstElementTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, spans);
    }

}