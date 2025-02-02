package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testNext() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(2, onlineStockSpan.next(120));
        assertEquals(3, onlineStockSpan.next(130));
        assertEquals(4, onlineStockSpan.next(150));
        assertEquals(5, onlineStockSpan.next(160));
        assertEquals(6, onlineStockSpan.next(170));
    }

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] expected = {1, 2, 1, 2, 1, 2};
        assertEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void testCalculateSpans_EmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        assertArrayEquals(new int[]{}, onlineStockSpan.calculateSpans(prices));
    }

}