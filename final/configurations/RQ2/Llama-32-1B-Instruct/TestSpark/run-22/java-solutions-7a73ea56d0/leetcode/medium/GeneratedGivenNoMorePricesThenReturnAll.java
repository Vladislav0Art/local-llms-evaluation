package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedGivenNoMorePricesThenReturnAll {

    @Test
    public void givenNoMorePricesThenReturnAll() {
        OnlineStockSpan mockOnlineStockSpan = mock(OnlineStockSpan.class);
        when(stack.peek()).thenReturn(mock(OnlineStockSpan.class));
        while (true) {
            mockOnlineStockSpan.next();
            if (!mockOnlineStockSpan.hasNext()) break;
            testPrices.add(new int[]{0});
        }
        result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(result.length, 3);
    }

}