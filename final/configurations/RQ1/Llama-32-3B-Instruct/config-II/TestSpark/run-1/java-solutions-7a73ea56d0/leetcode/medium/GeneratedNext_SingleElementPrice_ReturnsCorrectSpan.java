package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_SingleElementPrice_ReturnsCorrectSpan {

    @Test
    public void next_SingleElementPrice_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 1;
        assertEquals(expected, onlineStockSpan.next(price));
    }

}