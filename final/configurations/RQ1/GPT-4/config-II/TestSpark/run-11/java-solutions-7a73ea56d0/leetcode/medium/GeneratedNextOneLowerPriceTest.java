package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextOneLowerPriceTest {

    @Test
    public void nextOneLowerPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(80);
        assertEquals(2, onlineStockSpan.next(80));
    }

}