package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceIncreasingTest {

    @Test
    public void nextPriceIncreasingTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(80);
        int result = spanner.next(100);
        assertEquals(2, result);
    }

}