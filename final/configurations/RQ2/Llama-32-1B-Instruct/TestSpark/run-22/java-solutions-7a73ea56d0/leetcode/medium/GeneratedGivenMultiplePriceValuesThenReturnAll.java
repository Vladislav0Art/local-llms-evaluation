package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedGivenMultiplePriceValuesThenReturnAll {

    @Test
    public void givenMultiplePriceValuesThenReturnAll() {
        OnlineStockSpan mockOnlineStockSpan = mock(OnlineStockSpan.class);
        for (int i = 1; i <= 5; i++) {
            testPrices.add(new int[]{i});
            if (i == 3) break;
        }
        result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(result.length, 6);
    }

}