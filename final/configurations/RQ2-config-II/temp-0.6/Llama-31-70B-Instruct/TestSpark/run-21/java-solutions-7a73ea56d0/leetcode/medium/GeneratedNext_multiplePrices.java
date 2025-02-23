package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_multiplePrices {

    @Test
    public void next_multiplePrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        assertEquals(3, stockSpan.next(40));
    }

}