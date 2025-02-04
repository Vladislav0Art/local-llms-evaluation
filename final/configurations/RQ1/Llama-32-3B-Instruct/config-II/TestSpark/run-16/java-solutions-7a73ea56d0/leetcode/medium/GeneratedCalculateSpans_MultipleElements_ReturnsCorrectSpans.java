package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {10, 8, 9, 7, 6};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(result, new int[]{1, 2, 3, 4, 5});
    }

}