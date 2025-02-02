package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedNext_NegativeNumber_ReturnsCorrectSpan {

    @Test
    public void next_NegativeNumber_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when("price").thenReturn(-10);
        int result = onlineStockSpan.next(-10);
        assertEquals(3, result);
    }

}