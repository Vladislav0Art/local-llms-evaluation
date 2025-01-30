package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMixedValuesTest {

    @Test
    public void calculateSpansMixedValuesTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100, 80, 90, 120, 110, 75});
        assertArrayEquals(new int[]{1, 1, 2, 4, 1, 1}, spans);
    }

}