package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceIsLowerTest {

    @Test
    public void nextPriceIsLowerTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int result = span.next(100);
        assertEquals(1, result);

        result = span.next(50);
        assertEquals(1, result);
    }

}