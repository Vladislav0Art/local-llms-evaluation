package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNextPriceIsLowerThanCurrentPrice_WhenNextPriceIsLessThanCurrentPrice_Returns1 {

    @Test
    public void nextPriceIsLowerThanCurrentPrice_WhenNextPriceIsLessThanCurrentPrice_Returns1() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int nextPrice = stockSpan.next(6);

        // then
        assertEquals(1, nextPrice);
    }

}