package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpansSinglePriceTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
    private Stack<Integer> stack = new Stack<>();

    @Test
    public void calculateSpansSinglePriceTest() {
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}