package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_ReturnsCorrectSpans {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void calculateSpans_ReturnsCorrectSpans() {
        int[] prices = {100, 80, 75, 70, 60};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, stockSpan.list.toArray());
    }

}