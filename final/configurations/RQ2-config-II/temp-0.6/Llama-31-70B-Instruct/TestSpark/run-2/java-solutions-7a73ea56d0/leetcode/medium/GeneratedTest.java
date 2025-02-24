package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 100;
        int result = stock.next(price);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] result = stock.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}