package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNext_ReturnsCountOfPreviousValues_BelowPrice {

    private OnlineStockSpan onLineStockSpan = new OnlineStockSpan();

    @Test
    public void testNext_ReturnsCountOfPreviousValues_BelowPrice() {
        int price = 10;
        onlineStockSpan.next(price);
        int expected = 2;
        int actual = onLineStockSpan.next(price);
        assertEquals(expected, actual);
    }

}