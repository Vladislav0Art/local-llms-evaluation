package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testNext() {
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(20));
        assertEquals(1, onlineStockSpan.next(20));
        assertEquals(4, onlineStockSpan.next(40));
    }

    @Test
    public void testCalculateSpans() {
        int[] prices = {10, 20, 20, 40};
        int[] expectedSpans = {1, 2, 1, 4};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}