package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceIsHigherTest {

    @Test
    public void nextPriceIsHigherTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int result = span.next(100);
        assertEquals(1, result);

        result = span.next(150);
        assertEquals(2, result);
    }

}