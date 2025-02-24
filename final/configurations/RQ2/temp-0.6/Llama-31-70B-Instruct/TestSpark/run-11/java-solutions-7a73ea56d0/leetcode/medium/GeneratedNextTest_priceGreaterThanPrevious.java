package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest_priceGreaterThanPrevious {

    @Test
    public void nextTest_priceGreaterThanPrevious() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(1);
        int actual = stock.next(2);
        assertEquals(2, actual);
    }

}