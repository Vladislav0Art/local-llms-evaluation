package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextThreeSamePricesTest {

    @Test
    public void nextThreeSamePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(2, onlineStockSpan.next(100));
        assertEquals(3, onlineStockSpan.next(100));
    }

}