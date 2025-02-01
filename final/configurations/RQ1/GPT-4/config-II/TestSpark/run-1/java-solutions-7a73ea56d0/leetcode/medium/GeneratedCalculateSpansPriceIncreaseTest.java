package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansPriceIncreaseTest {

    @Test
    public void calculateSpansPriceIncreaseTest() {
        OnlineStockSpan os = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4};
        int[] spans = os.calculateSpans(prices);
        assertEquals(4, spans.length);
        for (int i = 0; i < 4; i++) {
            assertEquals(i + 1, spans[i]);
        }
    }

}