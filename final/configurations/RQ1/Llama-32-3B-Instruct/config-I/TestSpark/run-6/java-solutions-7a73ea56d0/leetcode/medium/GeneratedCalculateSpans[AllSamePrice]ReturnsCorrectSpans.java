package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans[AllSamePrice]

ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans[ AllSamePrice]ReturnsCorrectSpans() {
        int[] prices = {100, 100, 100, 100};
        int[] expectedSpans = {1, 2, 3, 4};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}