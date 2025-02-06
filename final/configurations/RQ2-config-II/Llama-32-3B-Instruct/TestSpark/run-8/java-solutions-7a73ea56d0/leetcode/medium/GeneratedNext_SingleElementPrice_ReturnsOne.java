package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_SingleElementPrice_ReturnsOne {

    private OnlineStockSpan stockSpan = new OnlineStack();

    @Test
    public void next_SingleElementPrice_ReturnsOne() {
        assertEquals(1, stockSpan.next(10));
    }

}