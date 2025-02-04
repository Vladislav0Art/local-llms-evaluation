package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNext_DifferentPrice_ReturnsCount {

    @Test
    public void next_DifferentPrice_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 100;
        int price2 = 150;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price2);
        assertEquals(1, onlineStockSpan.next(price1));
        assertEquals(2, onlineStockSpan.next(price2));
    }

}