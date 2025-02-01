package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansOnlyOnePriceTest {

    @Test
    public void calculateSpansOnlyOnePriceTest() {
        OnlineStockSpan os = new OnlineStockSpan();
        int[] prices = {10};
        int[] spans = os.calculateSpans(prices);
        assertEquals(1, spans.length);
        assertEquals(1, spans[0]);
    }

}