package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedGivenNoMoreStocksThenReturnAll {

    @Test
    public void givenNoMoreStocksThenReturnAll() {
        OnlineStockSpan mockOnlineStockSpan1 = mock(OnlineStockSpan.class);
        for (int i = 2; i <= 5; i++) {
            testPrices.add(new int[]{i});
            if (i == 3) break;
        }
        result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(result.length, 6);
    }

}