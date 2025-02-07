package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.jupiter.api.Test;

public class GeneratedTest_calculateSpans_given_all_prices_equal_to_the_previous_max_with_stocks {

    @Test
    public void test_calculateSpans_given_all_prices_equal_to_the_previous_max_with_stocks() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 10, 1, 7};
        onlineStockSpan.calculateSpans(prices);
        System.out.println(java.util.Arrays.toString(onlineStockSpan.calculateSpans(prices)));
    }

}