package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedNextPriceHigherThanPreviousTest {

    @Test
    public void nextPriceHigherThanPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(1, onlineStockSpan.next(120));
    }

}