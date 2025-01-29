package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestMaximizeLineCoverage_Scenario3 {

    @Test
    public void testMaximizeLineCoverage_Scenario3() {
        int[] prices = {1, 2, 3};
        OnlineStockSpan stock = new OnlineStockSpan();

        when(prices).anyOf(Arrays.asList(4, 5)).thenReturn(true);
        when(stock.next(4)).thenReturn(0);

        int expectedSpans = calculateSpans(prices);

        assertEquals(expectedSpans, stock.next(1));
    }

}