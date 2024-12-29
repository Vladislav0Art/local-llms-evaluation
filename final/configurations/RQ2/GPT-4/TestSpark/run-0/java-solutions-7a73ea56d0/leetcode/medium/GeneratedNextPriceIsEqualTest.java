package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceIsEqualTest {

    @Test
    public void nextPriceIsEqualTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int result = span.next(100);
        assertEquals(1, result);

        result = span.next(100);
        assertEquals(2, result);
    }

}