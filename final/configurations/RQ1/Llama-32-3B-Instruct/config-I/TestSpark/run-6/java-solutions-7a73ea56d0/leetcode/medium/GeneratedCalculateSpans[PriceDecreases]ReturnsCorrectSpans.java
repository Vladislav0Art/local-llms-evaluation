package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans[PriceDecreases]

ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans[ PriceDecreases]ReturnsCorrectSpans() {
        int[] prices = {100, 80, 75, 70, 65, 60, 55};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}