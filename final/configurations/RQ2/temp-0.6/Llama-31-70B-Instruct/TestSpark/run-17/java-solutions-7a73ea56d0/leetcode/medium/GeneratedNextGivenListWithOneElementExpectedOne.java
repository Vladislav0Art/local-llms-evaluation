package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextGivenListWithOneElementExpectedOne {

    @Test
    public void nextGivenListWithOneElementExpectedOne() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        int result = stockSpan.next(20);
        assertEquals(1, result);
    }

}