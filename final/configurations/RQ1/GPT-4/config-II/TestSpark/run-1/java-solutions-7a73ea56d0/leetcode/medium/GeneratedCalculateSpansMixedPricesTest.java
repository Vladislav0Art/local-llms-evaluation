package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansMixedPricesTest {

    @Test
    public void calculateSpansMixedPricesTest() {
        OnlineStockSpan os = new OnlineStockSpan();
        int[] prices = {3, 2, 7, 4, 5};
        int[] spans = os.calculateSpans(prices);
        assertEquals(5, spans.length);
        assertEquals(1, spans[0]);
        assertEquals(1, spans[1]);
        assertEquals(3, spans[2]);
        assertEquals(1, spans[3]);
        assertEquals(2, spans[4]);
    }

}