package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(2, onlineStockSpan.next(80));
        assertEquals(3, onlineStockSpan.next(60));
        assertEquals(4, onlineStockSpan.next(70));
        assertEquals(1, onlineStockSpan.next(120));
    }

    @Test
    public void nextTestEmpty() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(0));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, result);
    }

    @Test
    public void calculateSpansTestEmpty() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.calculateSpans(new int[]{});
    }

}