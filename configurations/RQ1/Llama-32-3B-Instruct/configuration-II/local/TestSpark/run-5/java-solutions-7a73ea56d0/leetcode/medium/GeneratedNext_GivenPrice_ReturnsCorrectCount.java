package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_GivenPrice_ReturnsCorrectCount {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_GivenPrice_ReturnsCorrectCount() {
        int price = 100;
        assertEquals(1, onlineStockSpan.next(price));
    }

}