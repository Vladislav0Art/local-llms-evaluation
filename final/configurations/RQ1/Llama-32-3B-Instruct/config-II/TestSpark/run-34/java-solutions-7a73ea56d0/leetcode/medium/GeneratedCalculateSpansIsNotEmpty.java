package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedCalculateSpansIsNotEmpty {

    @Test
    public void calculateSpansIsNotEmpty() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] priceArray = {0, 1, 2};
        assertArrayEquals(new int[]{1, 1, 3}, solution.calculateSpans(priceArray));
    }

}