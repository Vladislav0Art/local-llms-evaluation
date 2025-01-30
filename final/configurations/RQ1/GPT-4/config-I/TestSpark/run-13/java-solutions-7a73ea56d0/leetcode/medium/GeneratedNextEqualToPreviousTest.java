package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextEqualToPreviousTest {

    @Test
    public void nextEqualToPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        spanner.next(100);
        assertEquals(3, spanner.next(100));
    }

}