package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedGivenNoStocksGivenThenNoneSpan {

    @Test
    public void givenNoStocksGivenThenNoneSpan() {
        testPrices.add(new int[]{0});
        testPrices.add(new int[]{1});
        OnlineStockSpan mockOnlineStockSpan = mock(OnlineStockSpan.class);
        when(stack.peek()).thenReturn(mock(OnlineStockSpan.class));
        when(stack.pop()).thenReturn(mock(OnlineStockSpan.class));
        testPrices.add(new int[]{2});
        testPrices.add(new int[]{0});
        result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(1, result[0]);
    }

}