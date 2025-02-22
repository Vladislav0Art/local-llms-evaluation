package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextGivenListWithTwoElementsExpectedTwo {

    @Test
    public void nextGivenListWithTwoElementsExpectedTwo() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        int result = stockSpan.next(30);
        assertEquals(2, result);
    }

}