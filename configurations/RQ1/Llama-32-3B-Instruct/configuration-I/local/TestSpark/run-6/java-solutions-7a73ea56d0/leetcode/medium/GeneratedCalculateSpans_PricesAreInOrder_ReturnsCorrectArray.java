package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_PricesAreInOrder_ReturnsCorrectArray {

    @Test
    public void calculateSpans_PricesAreInOrder_ReturnsCorrectArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int[] prices = {100, 150, 200};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
    }

}