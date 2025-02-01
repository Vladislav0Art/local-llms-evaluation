package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedNextPriceLowerThanPreviousTest {

    @Test
    public void nextPriceLowerThanPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(1, onlineStockSpan.next(80));
    }

}