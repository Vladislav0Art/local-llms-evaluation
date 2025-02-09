package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextDecreasingPriceTest {

    @Test
    public void nextDecreasingPriceTest() {
        OnlineStockSpan onSpan = new OnlineStockSpan();
        onSpan.next(110);
        onSpan.next(105);
        int result = onSpan.next(100);
        assertEquals(1, result);
    }

}