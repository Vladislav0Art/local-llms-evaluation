package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 5};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(1, spans[2]);
    }

}