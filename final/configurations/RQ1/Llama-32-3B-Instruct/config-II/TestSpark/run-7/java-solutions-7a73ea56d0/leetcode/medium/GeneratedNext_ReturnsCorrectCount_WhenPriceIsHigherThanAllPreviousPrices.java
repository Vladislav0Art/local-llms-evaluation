package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_ReturnsCorrectCount_WhenPriceIsHigherThanAllPreviousPrices {

    @Test
    public void next_ReturnsCorrectCount_WhenPriceIsHigherThanAllPreviousPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int expectedCount = 1;
        int actualCount = onlineStockSpan.next(price);
        assertEquals(expectedCount, actualCount);
    }

}