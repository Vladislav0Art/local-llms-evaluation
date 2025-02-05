package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextMultipleInputTest {

    @Test
    public void nextMultipleInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(2, stockSpan.next(105));
    }

}