package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedNextWithHigherPriceTest {

    @Test
    public void nextWithHigherPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int price = 200;
        int expected = 1;
        assertEquals(expected, onlineStockSpan.next(price));
    }

}