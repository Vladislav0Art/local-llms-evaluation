package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNext_SinglePriceTest {

    @Test
    public void next_SinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 1;
        int actual = stockSpan.next(price);
        assertEquals(expected, actual);
    }

}