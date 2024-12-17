package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSpans_Example1 {

    private OnlineStockSpan onLineStockSpan = new OnlineStockSpan();

    @Test
    public void testCalculateSpans_Example1() {
        int[] prices = {3, 6, 2, 9};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.calculateSpans(prices);
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        onlineStockSpan.next(10); // push the price of last element
    }

}