package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedNext_NoPrecedingPrices_ReturnsOne {

    @Test
    public void next_NoPrecedingPrices_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(0));
    }

}