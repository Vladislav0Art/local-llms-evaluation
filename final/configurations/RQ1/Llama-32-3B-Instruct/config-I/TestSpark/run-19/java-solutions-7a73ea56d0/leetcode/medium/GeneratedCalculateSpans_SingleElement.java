package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedCalculateSpans_SingleElement {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void calculateSpans_SingleElement() {
        int[] prices = {7};
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] result = instance.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}