package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestMaximizeLineCoverage_Scenario2 {

    @Test
    public void testMaximizeLineCoverage_Scenario2() {
        int[] prices = {10, 9, 8, 7, 6, 5};
        OnlineStockSpan stock = new OnlineStockSpan();

        when(prices).anyOf(Arrays.asList(15, 14, 12, 11, 16)).thenReturn(true);
        when(stock.next(15)).thenReturn(2);

        int expectedSpans = calculateSpans(prices);

        assertEquals(expectedSpans, stock.next(10));
    }

}