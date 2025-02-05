package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(120));
        assertEquals(1, stockSpan.next(90));
        assertEquals(1, stockSpan.next(70));
        assertEquals(2, stockSpan.next(110));
    }

}