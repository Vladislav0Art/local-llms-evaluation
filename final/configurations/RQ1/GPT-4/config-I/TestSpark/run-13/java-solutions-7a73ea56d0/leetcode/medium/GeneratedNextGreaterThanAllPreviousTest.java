package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextGreaterThanAllPreviousTest {

    @Test
    public void nextGreaterThanAllPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        spanner.next(80);
        assertEquals(3, spanner.next(125));
    }

}