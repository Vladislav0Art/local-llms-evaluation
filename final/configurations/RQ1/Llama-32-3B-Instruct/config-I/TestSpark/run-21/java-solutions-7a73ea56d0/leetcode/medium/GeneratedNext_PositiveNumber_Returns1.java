package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedNext_PositiveNumber_Returns1 {

    @Test
    public void next_PositiveNumber_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when("price").thenReturn(20);
        int result = onlineStockSpan.next(20);
        assertEquals(1, result);
    }

}