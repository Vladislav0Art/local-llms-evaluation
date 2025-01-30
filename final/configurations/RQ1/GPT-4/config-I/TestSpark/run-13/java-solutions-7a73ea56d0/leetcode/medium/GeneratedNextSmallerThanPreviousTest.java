package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextSmallerThanPreviousTest {

    @Test
    public void nextSmallerThanPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        assertEquals(1, spanner.next(80));
    }

}