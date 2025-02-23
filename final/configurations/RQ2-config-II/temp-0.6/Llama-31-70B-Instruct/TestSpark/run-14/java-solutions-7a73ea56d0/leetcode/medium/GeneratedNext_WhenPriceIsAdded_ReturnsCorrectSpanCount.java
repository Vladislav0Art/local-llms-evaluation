package leetcode.medium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNext_WhenPriceIsAdded_ReturnsCorrectSpanCount {

    private OnlineStockSpan stock;
    private int[] prices;

    @Before
    public void setUp() {
        stock = new OnlineStockSpan();
        prices = new int[]{10, 20, 30, 40};
    }

    @Test
    public void next_WhenPriceIsAdded_ReturnsCorrectSpanCount() {
        assertEquals(1, stock.next(5));
    }

}