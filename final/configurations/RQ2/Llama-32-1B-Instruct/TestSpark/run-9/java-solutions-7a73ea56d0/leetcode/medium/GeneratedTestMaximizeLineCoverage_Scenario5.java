package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestMaximizeLineCoverage_Scenario5 {

    @Test
    public void testMaximizeLineCoverage_Scenario5() {
        int[] prices = {7};
        OnlineStockSpan stock = new OnlineStockSpan();

        when(prices).anyOf(Arrays.asList(8)).thenReturn(true);
        when(stock.next(8)).thenReturn(1);

        int expectedSpans = calculateSpans(prices);

        assertEquals(expectedSpans, stock.next(7));
    }

}