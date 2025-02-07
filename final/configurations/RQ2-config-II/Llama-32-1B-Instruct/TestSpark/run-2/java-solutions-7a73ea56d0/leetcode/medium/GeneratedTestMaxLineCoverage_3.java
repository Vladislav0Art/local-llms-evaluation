package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestMaxLineCoverage_3 {

    @Test
    public void testMaxLineCoverage_3() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(2)).thenReturn(-1);
        when(stock.next(20)).thenReturn(4);
        int[] prices = {2};
        int[] result = stock.calculateSpans(prices);
        assertEquals(0, result[0]);
    }

}