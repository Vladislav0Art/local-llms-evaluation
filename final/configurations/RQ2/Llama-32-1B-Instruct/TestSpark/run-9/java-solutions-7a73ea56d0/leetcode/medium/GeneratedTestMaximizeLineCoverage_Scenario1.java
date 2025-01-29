package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestMaximizeLineCoverage_Scenario1 {

    @Test
    public void testMaximizeLineCoverage_Scenario1() {
        int[] prices = {7, 6, 4, 3, 1};
        OnlineStockSpan stock = new OnlineStockSpan();

        when(prices).anyOf(Arrays.asList(10, 9, 8, 7, 6, 5)).thenReturn(true);
        when(stock.next(10)).thenReturn(2);

        int expectedSpans = calculateSpans(prices);

        assertEquals(expectedSpans, stock.next(7));
    }

}