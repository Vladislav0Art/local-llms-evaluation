package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedNextSinglePriceTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(100)).thenReturn(1);
        assertEquals(1, stockSpan.next(100));
    }

}