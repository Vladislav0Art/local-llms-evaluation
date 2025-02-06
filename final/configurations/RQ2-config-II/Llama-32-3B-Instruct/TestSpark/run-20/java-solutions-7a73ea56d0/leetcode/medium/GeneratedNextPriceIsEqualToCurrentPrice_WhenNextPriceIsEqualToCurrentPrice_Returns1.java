package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNextPriceIsEqualToCurrentPrice_WhenNextPriceIsEqualToCurrentPrice_Returns1 {

    @Test
    public void nextPriceIsEqualToCurrentPrice_WhenNextPriceIsEqualToCurrentPrice_Returns1() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int nextPrice = stockSpan.next(6);

        // then
        assertEquals(1, nextPrice);
    }

}