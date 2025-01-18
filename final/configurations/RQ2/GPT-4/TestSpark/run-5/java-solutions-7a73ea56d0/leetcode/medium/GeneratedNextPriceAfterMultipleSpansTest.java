package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceAfterMultipleSpansTest {

    @Test
    public void nextPriceAfterMultipleSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(7);
        onlineStockSpan.next(8);
        onlineStockSpan.next(9);
        int actualSpan = onlineStockSpan.next(10);
        int expectedSpan = 4;
        assertEquals(expectedSpan, actualSpan);
    }

}