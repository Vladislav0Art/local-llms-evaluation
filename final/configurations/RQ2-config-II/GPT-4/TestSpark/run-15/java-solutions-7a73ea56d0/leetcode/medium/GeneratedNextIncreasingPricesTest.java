package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIncreasingPricesTest {

    @Test
    public void nextIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(200);
        int actual = stockSpan.next(300);
        assertEquals(3, actual);
    }

}