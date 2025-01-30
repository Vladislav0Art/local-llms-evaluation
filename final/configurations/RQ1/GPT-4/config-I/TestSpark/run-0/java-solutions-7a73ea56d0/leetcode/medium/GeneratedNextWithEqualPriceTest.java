package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedNextWithEqualPriceTest {

    @Test
    public void nextWithEqualPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int price = 100;
        int expected = 2;
        assertEquals(expected, onlineStockSpan.next(price));
    }

}