package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans[PriceIncreases]

ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans[ PriceIncreases]ReturnsCorrectSpans() {
        int[] prices = {100, 120, 80, 75, 60, 55, 65, 77, 90};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}