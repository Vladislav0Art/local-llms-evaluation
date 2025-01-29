package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestMaximizeLineCoverage_Scenario4 {

    @Test
    public void testMaximizeLineCoverage_Scenario4() {
        int[] prices = {2, 3};
        OnlineStockSpan stock = new OnlineStockSpan();

        when(prices).anyOf(Arrays.asList(6)).thenReturn(true);
        when(stock.next(6)).thenReturn(0);

        int expectedSpans = calculateSpans(prices);

        assertEquals(expectedSpans, stock.next(2));
    }

}