package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpansMultiplePricesTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
    private Stack<Integer> stack = new Stack<>();

    @Test
    public void calculateSpansMultiplePricesTest() {
        int[] prices = {3, 5, 2, 7, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2, 2, 3}, result);
    }

}