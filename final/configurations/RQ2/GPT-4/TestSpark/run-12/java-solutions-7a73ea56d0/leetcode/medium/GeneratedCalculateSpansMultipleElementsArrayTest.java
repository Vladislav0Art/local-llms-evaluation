package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleElementsArrayTest {

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{100, 120, 140, 160});
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}