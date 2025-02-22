package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    private OnlineStockSpan stockSpan;

    @Before
    public void setup() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest() {
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(5));
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpans = {1, 1, 1, 2, 1, 4, 6};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}