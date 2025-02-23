package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextSmallPriceTest {

    @Test
    public void nextSmallPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 2;

        int expected = 1;
        int result = stockSpan.next(price);

        assertEquals(expected, result);
    }

}