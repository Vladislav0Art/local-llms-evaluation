package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNextPriceIsLowerThanCurrentPrice_WhenNextPriceIsGreaterThanCurrentPrice_Returns2 {

    @Test
    public void nextPriceIsLowerThanCurrentPrice_WhenNextPriceIsGreaterThanCurrentPrice_Returns2() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int nextPrice = stockSpan.next(6);

        // then
        assertEquals(2, nextPrice);
    }

}