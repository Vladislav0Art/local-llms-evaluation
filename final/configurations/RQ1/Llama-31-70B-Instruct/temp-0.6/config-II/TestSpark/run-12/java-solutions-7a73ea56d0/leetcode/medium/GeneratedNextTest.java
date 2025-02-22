package leetcode.medium;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class GeneratedNextTest {

    private OnlineStockSpan stockSpan;

    @Test
    public void nextTest() {
        stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertEquals(1, result);
    }

}