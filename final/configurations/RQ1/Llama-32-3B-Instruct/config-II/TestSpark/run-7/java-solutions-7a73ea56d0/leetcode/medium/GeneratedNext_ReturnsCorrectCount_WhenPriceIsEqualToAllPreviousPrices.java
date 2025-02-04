package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_ReturnsCorrectCount_WhenPriceIsEqualToAllPreviousPrices {

    @Test
    public void next_ReturnsCorrectCount_WhenPriceIsEqualToAllPreviousPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 5;
        int expectedCount = 2;
        int actualCount = onlineStockSpan.next(price);
        assertEquals(expectedCount, actualCount);
    }

}