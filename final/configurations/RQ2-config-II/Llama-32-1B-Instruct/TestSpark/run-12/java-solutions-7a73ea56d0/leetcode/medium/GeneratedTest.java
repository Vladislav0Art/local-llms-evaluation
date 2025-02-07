package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testNext_() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 10;
        when(next(5)).thenReturn(price + 1);
        int result = instance.next(price);
        assertEquals(2, result);

        price = 7;
        result = instance.next(price);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateSpans_() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {5, 7, 8};
        when(calculateSpans(prices)).thenReturn(new int[]{2, 3, 4});
        int result = instance.calculateSpans(prices);
        assertEquals(9, result);

        prices = new int[]{10, 20, 30, 40};
        when(calculateSpans(prices)).thenReturn(new int[]{5, 6, 7, 8});
        result = instance.calculateSpans(prices);
        assertEquals(13, result);

        prices = {2, 4, 3, 10, 20};
        when(calculateSpans(prices)).thenReturn(new int[]{1, 2, 3, 5});
        result = instance.calculateSpans(prices);
        assertEquals(11, result);
    }

    @Test
    public void testCalculateSpans_NoPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {};
        when(calculateSpans(prices)).thenReturn(new int[]{});
        assertArrayEquals(new int[]{}, instance.calculateSpans(prices));
    }

}