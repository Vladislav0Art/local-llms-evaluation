package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void givenNoPricesGiven_thenInitialZeroSpan() {
        when(stack.peek()).thenReturn(null);
        int[] result = stack.calculateSpans(new int[]{0});
        assertEquals(1, result[0]);
    }

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

    @Test
    public void givenPrice0_thenOneSpan() {
        OnlineStockSpan mockOnlineStockSpan = mock(OnlineStockSpan.class);
        when(mockOnlineStockSpan.next(0)).thenReturn(0);
        testPrices.add(new int[]{0});
        int[] result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(1, result[0]);
    }

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