package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 2, 4}, spans);
    }

}