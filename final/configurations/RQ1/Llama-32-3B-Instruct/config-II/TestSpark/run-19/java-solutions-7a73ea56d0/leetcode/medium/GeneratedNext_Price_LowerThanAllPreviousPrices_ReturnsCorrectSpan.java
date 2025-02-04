package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_Price_LowerThanAllPreviousPrices_ReturnsCorrectSpan {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_Price_LowerThanAllPreviousPrices_ReturnsCorrectSpan() {
        stockSpan.list.add(10);
        stockSpan.list.add(20);
        stockSpan.list.add(5);
        assertEquals(4, stockSpan.next(3));
    }

}