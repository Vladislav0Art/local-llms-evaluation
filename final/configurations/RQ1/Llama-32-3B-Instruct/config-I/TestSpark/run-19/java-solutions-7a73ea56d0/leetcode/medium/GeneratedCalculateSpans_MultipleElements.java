package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedCalculateSpans_MultipleElements {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void calculateSpans_MultipleElements() {
        int[] prices = {30, 103, 75, 30, 100, 130};
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] result = instance.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 1, 2, 1, 3}, result);
    }

}