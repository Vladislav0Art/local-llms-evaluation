package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_SinglePrice_ReturnsOne {

    @Test
    public void next_SinglePrice_ReturnsOne() {
        OnlineStockSpan s = new OnlineStockSpan();
        int result = s.next(100);
        assertEquals(1, result);
    }

}