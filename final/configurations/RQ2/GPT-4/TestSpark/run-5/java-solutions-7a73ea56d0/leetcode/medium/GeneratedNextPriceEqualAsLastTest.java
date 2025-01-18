package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceEqualAsLastTest {

    @Test
    public void nextPriceEqualAsLastTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(5);
        int actualSpan = onlineStockSpan.next(5);
        int expectedSpan = 2;
        assertEquals(expectedSpan, actualSpan);
    }

}