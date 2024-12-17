package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.SpyBean;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class GeneratedNext_DivideByZeroException_WhenNextIsCalledWithZeroPrice {

    @Mock
    private StockPriceService stockPriceService;

    @SpyBean
    public OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_DivideByZeroException_WhenNextIsCalledWithZeroPrice() {
        when(stockPriceService.getPrice()).thenReturn(0);
        assertThrows(DivisionByZeroException.class, () -> onlineStockSpan.next(0));
    }

}