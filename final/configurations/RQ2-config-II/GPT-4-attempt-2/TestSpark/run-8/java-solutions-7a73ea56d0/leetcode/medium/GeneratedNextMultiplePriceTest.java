package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultiplePriceTest {

    @Test
    public void nextMultiplePriceTest() {
        OnlineStockSpan onSpan = new OnlineStockSpan();
        onSpan.next(100);
        int result = onSpan.next(80);
        assertEquals(1, result);
    }

}