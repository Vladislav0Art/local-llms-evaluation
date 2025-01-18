package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextMultipleCallsTest {

    @Test
    public void nextMultipleCallsTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(1, stockSpan.next(80));
        assertEquals(1, stockSpan.next(60));
        assertEquals(1, stockSpan.next(70));
        assertEquals(2, stockSpan.next(60));
        assertEquals(1, stockSpan.next(75));
        assertEquals(4, stockSpan.next(85));
    }

}