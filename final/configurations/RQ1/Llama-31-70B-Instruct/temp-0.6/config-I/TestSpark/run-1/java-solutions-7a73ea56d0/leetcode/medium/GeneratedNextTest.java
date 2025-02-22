package leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(1));
        assertEquals(1, stock.next(2));
        assertEquals(2, stock.next(3));
        assertEquals(1, stock.next(4));
    }

}