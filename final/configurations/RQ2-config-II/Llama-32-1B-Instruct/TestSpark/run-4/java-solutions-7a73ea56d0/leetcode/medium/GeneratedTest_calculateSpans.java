package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest_calculateSpans {

    public List<Integer> next(int price) {
        return next(price, 0);
    }

    @Test
    public void test_calculateSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 5, 6, 4, 3};
        System.out.println(java.util.Arrays.toString(onlineStockSpan.calculateSpans(prices))); // [1, 1, 2, 3, 5]
    }

}