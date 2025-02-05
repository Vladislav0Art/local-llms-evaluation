package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithMultipleElementsTest {

    @Test
    public void calculateSpansWithMultipleElementsTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 2, 4}, spans);
    }

}