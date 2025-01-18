package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMixedElementsArrayTest {

    @Test
    public void calculateSpansMixedElementsArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{100, 120, 80, 160});
        assertArrayEquals(new int[]{1, 2, 1, 4}, result);
    }

}