package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestMaxLineCoverage_6 {

    @Test
    public void testMaxLineCoverage_6() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(200)).thenReturn(-1);
        int[] prices = {200};
        int[] result = stock.calculateSpans(prices);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }

}