package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIncreasingPricesTest {

    @Test
    public void nextIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(20));
        assertEquals(3, stockSpan.next(30));
        assertEquals(4, stockSpan.next(40));
        assertEquals(5, stockSpan.next(50));
    }

}