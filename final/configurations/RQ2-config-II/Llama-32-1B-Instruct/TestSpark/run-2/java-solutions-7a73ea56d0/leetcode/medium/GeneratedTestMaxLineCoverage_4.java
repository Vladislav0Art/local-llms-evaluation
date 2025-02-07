package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestMaxLineCoverage_4 {

    @Test
    public void testMaxLineCoverage_4() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(100)).thenReturn(-1);
        int[] prices = {100};
        int[] result = stock.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}