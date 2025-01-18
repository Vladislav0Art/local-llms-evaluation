package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceGreaterThanLastTest {

    @Test
    public void nextPriceGreaterThanLastTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(5);
        int actualSpan = onlineStockSpan.next(7);
        int expectedSpan = 2;
        assertEquals(expectedSpan, actualSpan);
    }

}