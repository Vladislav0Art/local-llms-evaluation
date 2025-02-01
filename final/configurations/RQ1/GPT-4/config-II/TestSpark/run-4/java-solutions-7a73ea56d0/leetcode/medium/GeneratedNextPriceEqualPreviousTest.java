package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedNextPriceEqualPreviousTest {

    @Test
    public void nextPriceEqualPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(2, onlineStockSpan.next(100));
    }

}