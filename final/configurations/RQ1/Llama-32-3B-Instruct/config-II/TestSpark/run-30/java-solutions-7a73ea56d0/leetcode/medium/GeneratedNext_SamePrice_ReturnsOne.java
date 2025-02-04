package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNext_SamePrice_ReturnsOne {

    @Test
    public void next_SamePrice_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 100;
        assertEquals(1, onlineStockSpan.next(price));
    }

}