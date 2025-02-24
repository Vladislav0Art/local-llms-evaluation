package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest2 {

    @Test
    public void nextTest2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 2;
        int actual = onlineStockSpan.next(price);
        assertEquals(expected, actual);
    }

}