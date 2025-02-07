package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestMaxLineCoverage_2 {

    @Test
    public void testMaxLineCoverage_2() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(1)).thenReturn(-1);
        int[] prices = {1};
        int[] result = stock.calculateSpans(prices);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

}