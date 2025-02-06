package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_SingleElement_ReturnsIntArrayWithOneElement {

    @Test
    public void calculateSpans_SingleElement_ReturnsIntArrayWithOneElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result.length);
        assertEquals(100, result[0]);
    }

}