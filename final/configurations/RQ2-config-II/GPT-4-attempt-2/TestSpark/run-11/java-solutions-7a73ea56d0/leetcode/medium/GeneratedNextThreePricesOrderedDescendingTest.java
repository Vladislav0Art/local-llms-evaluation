package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextThreePricesOrderedDescendingTest {

    @Test
    public void nextThreePricesOrderedDescendingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        assertEquals(1, onlineStockSpan.next(120));
        assertEquals(2, onlineStockSpan.next(100));
        assertEquals(3, onlineStockSpan.next(80));
    }

}