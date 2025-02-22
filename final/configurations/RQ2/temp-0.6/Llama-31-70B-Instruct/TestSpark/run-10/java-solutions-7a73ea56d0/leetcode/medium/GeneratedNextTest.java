package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(1));
        assertEquals(2, stock.next(2));
        assertEquals(1, stock.next(1));
    }

}