package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceAfterMultipleDecreasingSpansTest {

    @Test
    public void nextPriceAfterMultipleDecreasingSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(9);
        onlineStockSpan.next(8);
        onlineStockSpan.next(7);
        int actualSpan = onlineStockSpan.next(6);
        int expectedSpan = 1;
        assertEquals(expectedSpan, actualSpan);
    }

}