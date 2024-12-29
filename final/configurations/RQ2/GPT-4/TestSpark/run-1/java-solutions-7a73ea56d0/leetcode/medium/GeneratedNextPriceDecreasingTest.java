package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceDecreasingTest {

    @Test
    public void nextPriceDecreasingTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        int result = spanner.next(80);
        assertEquals(1, result);
    }

}