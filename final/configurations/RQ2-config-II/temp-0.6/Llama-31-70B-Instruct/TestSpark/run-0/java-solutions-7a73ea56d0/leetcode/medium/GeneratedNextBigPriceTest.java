package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextBigPriceTest {

    @Test
    public void nextBigPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 10;

        int expected = 1;
        int result = stockSpan.next(price);

        assertEquals(expected, result);
    }

}