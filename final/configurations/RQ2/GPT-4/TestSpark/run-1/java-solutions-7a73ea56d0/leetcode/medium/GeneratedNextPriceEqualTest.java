package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceEqualTest {

    @Test
    public void nextPriceEqualTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        int result = spanner.next(100);
        assertEquals(2, result);
    }

}