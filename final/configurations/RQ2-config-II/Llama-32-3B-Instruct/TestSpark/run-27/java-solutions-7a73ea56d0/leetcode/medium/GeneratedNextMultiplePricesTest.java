package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(100)).thenReturn(1);
        when(stockSpan.next(200)).thenReturn(2);
        when(stockSpan.next(50)).thenReturn(3);
        assertEquals(3, stockSpan.next(50));
    }

}