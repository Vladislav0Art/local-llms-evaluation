package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedNext_Returns1WhenPriceIs0 {

    @Test
    public void next_Returns1WhenPriceIs0() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(0);
        assertEquals(1, result);
    }

}