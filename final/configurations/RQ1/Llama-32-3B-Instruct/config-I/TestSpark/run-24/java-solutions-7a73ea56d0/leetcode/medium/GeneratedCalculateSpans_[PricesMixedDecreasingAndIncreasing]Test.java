package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_[PricesMixedDecreasingAndIncreasing]

Test {

    @Test
    public void calculateSpans_[ PricesMixedDecreasingAndIncreasing]Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-5, -4, 3, 0, 5};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1,2,3,2,1]"));
    }

}