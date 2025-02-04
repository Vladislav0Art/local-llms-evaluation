package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNext_LowerPrice_ReturnsCount {

    @Test
    public void next_LowerPrice_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 100;
        int price2 = 90;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price2);
        assertEquals(2, onlineStockSpan.next(price1));
        assertEquals(3, onlineStockSpan.next(price2));
    }

}