package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(spans[0], 1);
        assertEquals(spans[1], 2);
        assertEquals(spans[2], 3);
        assertEquals(spans[3], 4);
        assertEquals(spans[4], 5);
    }

}