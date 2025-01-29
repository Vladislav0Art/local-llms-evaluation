package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedGivenMultipleStocksThenReturnAll {

    @Test
    public void givenMultipleStocksThenReturnAll() {
        OnlineStockSpan mockOnlineStockSpan1 = mock(OnlineStockSpan.class);
        testPrices.add(new int[]{1});
        for (int i = 2; i <= 5; i++) {
            testPrices.add(new int[]{i});
            if (i == 3) break;
        }
        OnlineStockSpan mockOnlineStockSpan2 = mock(OnlineStockSpan.class);
        mockOnlineStockSpan1.next();
        for (int i = 6; i <= 10; i++) {
            testPrices.add(new int[]{i});
            mockOnlineStockSpan2.next();
        }
        result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(result.length, 14);
    }

}