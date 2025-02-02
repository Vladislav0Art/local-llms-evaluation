package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_PriceGreaterThanFirstPrice_CountIsTwo {

    @Test
    public void next_PriceGreaterThanFirstPrice_CountIsTwo() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(10);
        stock.next(20);
        assertEquals(2, stock.next(10));
    }

}