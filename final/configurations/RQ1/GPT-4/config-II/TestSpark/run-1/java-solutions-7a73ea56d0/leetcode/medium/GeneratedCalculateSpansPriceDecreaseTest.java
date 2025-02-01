package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansPriceDecreaseTest {

    @Test
    public void calculateSpansPriceDecreaseTest() {
        OnlineStockSpan os = new OnlineStockSpan();
        int[] prices = {4, 3, 2, 1};
        int[] spans = os.calculateSpans(prices);
        assertEquals(4, spans.length);
        for (int i = 0; i < 4; i++) {
            assertEquals(1, spans[i]);
        }
    }

}