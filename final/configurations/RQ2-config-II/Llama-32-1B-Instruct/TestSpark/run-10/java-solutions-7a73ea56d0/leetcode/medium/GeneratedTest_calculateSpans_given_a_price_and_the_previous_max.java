package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.jupiter.api.Test;

public class GeneratedTest_calculateSpans_given_a_price_and_the_previous_max {

    @Test
    public void test_calculateSpans_given_a_price_and_the_previous_max() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 10, 1, 7};
        onlineStockSpan.calculateSpans(prices);
        System.out.println(java.util.Arrays.toString(onlineStockSpan.calculateSpans(prices)));
    }

}