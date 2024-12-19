package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.SpyBean;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpans_ReturnsCorrectArray_WhenCalculateSpansIsCalled {

    @Mock
    private StockPriceService stockPriceService;

    @SpyBean
    public OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_ReturnsCorrectArray_WhenCalculateSpansIsCalled() {
        int[] prices = {10, 15, 20};
        int[] expectedSpans = {1, 2, 3};
        when(stockPriceService.getPrices()).thenReturn(prices);
        assertEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}