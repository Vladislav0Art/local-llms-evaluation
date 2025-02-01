package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan os = new OnlineStockSpan();
        int[] prices = {};
        int[] spans = os.calculateSpans(prices);
        assertEquals(0, spans.length);
    }

}