package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.SpyBean;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class GeneratedNext_ExpectedResultIs1_WhenNextIsCalledWithPositivePrice {

    @Mock
    private StockPriceService stockPriceService;

    @SpyBean
    public OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_ExpectedResultIs1_WhenNextIsCalledWithPositivePrice() {
        when(stockPriceService.getPrice()).thenReturn(10);
        assertEquals(1, onlineStockSpan.next(10));
    }

}