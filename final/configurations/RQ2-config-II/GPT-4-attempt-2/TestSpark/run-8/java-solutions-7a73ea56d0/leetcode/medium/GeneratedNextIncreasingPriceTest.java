package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIncreasingPriceTest {

    @Test
    public void nextIncreasingPriceTest() {
        OnlineStockSpan onSpan = new OnlineStockSpan();
        onSpan.next(100);
        onSpan.next(105);
        int result = onSpan.next(110);
        assertEquals(3, result);
    }

}