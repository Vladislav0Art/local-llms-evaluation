package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.SpyBean;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class GeneratedNext_ExpectedResultIncreasesByOne_WhenNextIsCalledConsecutiveTimes {

    @Mock
    private StockPriceService stockPriceService;

    @SpyBean
    public OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_ExpectedResultIncreasesByOne_WhenNextIsCalledConsecutiveTimes() {
        int[] priceArray = {10, 15, 20};
        for (int i = 0; i < priceArray.length - 1; i++) {
            when(stockPriceService.getPrice()).thenReturn(priceArray[i]);
            assertEquals(i + 2, onlineStockSpan.next(priceArray[i]));
        }
    }

}