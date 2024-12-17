package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_PricesAreNotEqual_ReturnsCorrectArray {

    @Test
    public void calculateSpans_PricesAreNotEqual_ReturnsCorrectArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int[] prices = {100, 150};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(3, spans[0]);
    }

}