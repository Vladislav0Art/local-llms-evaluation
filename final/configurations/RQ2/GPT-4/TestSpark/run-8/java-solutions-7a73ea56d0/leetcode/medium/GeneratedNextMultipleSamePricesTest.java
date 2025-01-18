package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedNextMultipleSamePricesTest {

    @Test
    public void nextMultipleSamePricesTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int result = spanner.next(10);
        result = spanner.next(10);
        assertEquals(2, result);
    }

}