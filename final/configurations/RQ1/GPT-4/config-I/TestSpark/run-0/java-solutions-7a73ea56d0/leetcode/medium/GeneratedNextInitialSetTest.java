package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedNextInitialSetTest {

    @Test
    public void nextInitialSetTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 1;
        assertEquals(expected, onlineStockSpan.next(price));
    }

}