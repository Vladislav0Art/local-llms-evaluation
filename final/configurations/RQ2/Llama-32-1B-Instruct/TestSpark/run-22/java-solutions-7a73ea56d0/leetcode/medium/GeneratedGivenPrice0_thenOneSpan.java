package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedGivenPrice0_thenOneSpan {

    @Test
    public void givenPrice0_thenOneSpan() {
        OnlineStockSpan mockOnlineStockSpan = mock(OnlineStockSpan.class);
        when(mockOnlineStockSpan.next(0)).thenReturn(0);
        testPrices.add(new int[]{0});
        int[] result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(1, result[0]);
    }

}