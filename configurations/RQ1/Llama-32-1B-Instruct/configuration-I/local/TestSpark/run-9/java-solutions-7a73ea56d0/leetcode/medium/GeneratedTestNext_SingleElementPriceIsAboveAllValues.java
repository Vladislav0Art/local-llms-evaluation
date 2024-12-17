package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNext_SingleElementPriceIsAboveAllValues {

    private OnlineStockSpan onLineStockSpan = new OnlineStockSpan();

    @Test
    public void testNext_SingleElementPriceIsAboveAllValues() {
        int price = 2;
        onlineStockSpan.next(price);
        onlineStockSpan.next(0); // push the index of first element
        onlineStockSpan.next(1); // push the index of second element
        onlineStockSpan.next(9); // push the index of third element
        int expected = 3;
        int actual = onLineStockSpan.next(price);
        assertEquals(expected, actual);
    }

}