package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.SpyBean;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Mock
    private StockPriceService stockPriceService;

    @SpyBean
    public OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_DivideByZeroException_WhenNextIsCalledWithZeroPrice() {
        when(stockPriceService.getPrice()).thenReturn(0);
        assertThrows(DivisionByZeroException.class, () -> onlineStockSpan.next(0));
    }

    @Test
    public void next_ExpectedResultIs1_WhenNextIsCalledWithPositivePrice() {
        when(stockPriceService.getPrice()).thenReturn(10);
        assertEquals(1, onlineStockSpan.next(10));
    }

    @Test
    public void next_ExpectedResultIncreasesByOne_WhenNextIsCalledConsecutiveTimes() {
        int[] priceArray = {10, 15, 20};
        for (int i = 0; i < priceArray.length - 1; i++) {
            when(stockPriceService.getPrice()).thenReturn(priceArray[i]);
            assertEquals(i + 2, onlineStockSpan.next(priceArray[i]));
        }
    }

    @Test
    public void calculateSpans_ReturnsCorrectArray_WhenCalculateSpansIsCalled() {
        int[] prices = {10, 15, 20};
        int[] expectedSpans = {1, 2, 3};
        when(stockPriceService.getPrices()).thenReturn(prices);
        assertEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_ReturnsCorrectArray_WhenCalculateSpansIsCalledWithEmptyArray() {
        int[] prices = {};
        int[] expectedSpans = {};
        when(stockPriceService.getPrices()).thenReturn(prices);
        assertEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}