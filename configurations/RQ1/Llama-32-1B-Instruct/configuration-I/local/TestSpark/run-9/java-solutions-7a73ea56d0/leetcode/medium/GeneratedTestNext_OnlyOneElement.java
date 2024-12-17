package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNext_OnlyOneElement {

    private OnlineStockSpan onLineStockSpan = new OnlineStockSpan();

    @Test
    public void testNext_OnlyOneElement() {
        int price = 1;
        onlineStockSpan.next(price);
        onlineStockSpan.next(0); // push the index of first element
        int expected = 1;
        int actual = onLineStockSpan.next(price);
        assertEquals(expected, actual);
    }

}