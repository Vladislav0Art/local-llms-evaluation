package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest3 {

    @Test
    public void nextTest3() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(1);
        stock.next(2);
        int result = stock.next(3);
        assertEquals(1, result);
    }

}