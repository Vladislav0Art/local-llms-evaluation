package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextThreeDifferentPricesTest {

    @Test
    public void nextThreeDifferentPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(1, onlineStockSpan.next(80));
        assertEquals(1, onlineStockSpan.next(120));
    }

}