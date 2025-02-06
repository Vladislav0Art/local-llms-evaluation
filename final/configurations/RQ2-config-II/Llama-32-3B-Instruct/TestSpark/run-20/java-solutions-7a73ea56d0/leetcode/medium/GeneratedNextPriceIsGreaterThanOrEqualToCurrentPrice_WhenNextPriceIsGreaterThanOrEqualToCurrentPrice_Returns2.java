package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNextPriceIsGreaterThanOrEqualToCurrentPrice_WhenNextPriceIsGreaterThanOrEqualToCurrentPrice_Returns2 {

    @Test
    public void nextPriceIsGreaterThanOrEqualToCurrentPrice_WhenNextPriceIsGreaterThanOrEqualToCurrentPrice_Returns2() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int nextPrice = stockSpan.next(6);

        // then
        assertEquals(2, nextPrice);
    }

}