package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceLowerThanLastTest {

    @Test
    public void nextPriceLowerThanLastTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(7);
        int actualSpan = onlineStockSpan.next(5);
        int expectedSpan = 1;
        assertEquals(expectedSpan, actualSpan);
    }

}