package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(20));
        assertEquals(1, stockSpan.next(15));
        assertEquals(4, stockSpan.next(5));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 20, 15, 5};
        int[] expectedSpans = new int[]{1, 2, 1, 4};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}