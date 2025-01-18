package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedNextMultipleDifferentPricesTest {

    @Test
    public void nextMultipleDifferentPricesTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int result = spanner.next(10);
        result = spanner.next(20);
        assertEquals(2, result);
        result = spanner.next(5);
        assertEquals(1, result);
    }

}