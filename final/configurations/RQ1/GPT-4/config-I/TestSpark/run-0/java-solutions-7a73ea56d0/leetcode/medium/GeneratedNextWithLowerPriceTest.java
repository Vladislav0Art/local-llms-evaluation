package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedNextWithLowerPriceTest {

    @Test
    public void nextWithLowerPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int price = 50;
        int expected = 2;
        assertEquals(expected, onlineStockSpan.next(price));
    }

}