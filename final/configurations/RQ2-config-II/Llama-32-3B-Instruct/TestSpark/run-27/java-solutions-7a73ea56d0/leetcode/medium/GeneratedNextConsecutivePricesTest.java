package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedNextConsecutivePricesTest {

    @Test
    public void nextConsecutivePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(100)).thenReturn(1);
        when(stockSpan.next(110)).thenReturn(2);
        when(stockSpan.next(120)).thenReturn(3);
        assertEquals(4, stockSpan.next(120));
    }

}