package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedCalculateSpans_3Scenario_Test {

    @Test
    public void calculateSpans_3Scenario_Test() {
        int[] prices = {5};
        OnlineStockSpan.OnlineStockSpan result = new OnlineStockSpan();
        when(OnlineStockSpan.next(Mockito.anyInt())).thenReturn(0).thenReturn(price + 1);
        String[] expected = {"1"};
        for (int i = 0; i < prices.length; i++) {
            result.calculateSpans(prices[i]);
        }
        assertEquals(expected[0], result.calculateSpans(Mockito.anyInt()));
    }

}