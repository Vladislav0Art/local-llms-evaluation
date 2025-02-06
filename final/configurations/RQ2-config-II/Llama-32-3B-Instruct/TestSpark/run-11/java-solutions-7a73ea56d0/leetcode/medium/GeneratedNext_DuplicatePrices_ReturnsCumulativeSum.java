package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNext_DuplicatePrices_ReturnsCumulativeSum {

    @Test
    public void next_DuplicatePrices_ReturnsCumulativeSum() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            int result = solution.next(price);
            assertThat(result, is(prices.length - prices.indexOf(price)));
        }
    }

}