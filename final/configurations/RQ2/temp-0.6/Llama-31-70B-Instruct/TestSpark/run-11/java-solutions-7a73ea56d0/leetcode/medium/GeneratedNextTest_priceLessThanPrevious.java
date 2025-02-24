package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest_priceLessThanPrevious {

    @Test
    public void nextTest_priceLessThanPrevious() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(2);
        int actual = stock.next(1);
        assertEquals(1, actual);
    }

}