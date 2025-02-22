package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextTest {

    private OnlineStockSpan stockSpan;

    @Before
    public void setup() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest() {
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(5));
    }

}