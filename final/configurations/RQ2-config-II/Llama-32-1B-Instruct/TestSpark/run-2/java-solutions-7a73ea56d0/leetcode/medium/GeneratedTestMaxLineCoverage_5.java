package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestMaxLineCoverage_5 {

    @Test
    public void testMaxLineCoverage_5() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(50)).thenReturn(-1);
        int[] prices = {50};
        int[] result = stock.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}