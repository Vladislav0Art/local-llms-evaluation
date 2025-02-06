package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_SinglePriceStaySame_ReturnsOne {

    @Test
    public void next_SinglePriceStaySame_ReturnsOne() {
        int[] prices = {10};
        assertEquals(1, new OnlineStockSpan().next(prices[0]));
    }

}