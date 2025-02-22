package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, onlineStockSpan.calculateSpans(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, onlineStockSpan.calculateSpans(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 1, 4, 1}, onlineStockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60}));
    }

}