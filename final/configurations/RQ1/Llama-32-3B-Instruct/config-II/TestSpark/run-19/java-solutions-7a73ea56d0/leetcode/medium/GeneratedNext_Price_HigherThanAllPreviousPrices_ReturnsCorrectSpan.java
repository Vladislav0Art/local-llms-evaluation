package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_Price_HigherThanAllPreviousPrices_ReturnsCorrectSpan {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_Price_HigherThanAllPreviousPrices_ReturnsCorrectSpan() {
        assertEquals(1, stockSpan.next(100));
    }

}