package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestMaxLineCoverage_7 {

    @Test
    public void testMaxLineCoverage_7() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(300)).thenReturn(-1);
        int[] prices = {300};
        int[] result = stock.calculateSpans(prices);
        assertEquals(4, result[0]);
        assertEquals(5, result[1]);
    }

}