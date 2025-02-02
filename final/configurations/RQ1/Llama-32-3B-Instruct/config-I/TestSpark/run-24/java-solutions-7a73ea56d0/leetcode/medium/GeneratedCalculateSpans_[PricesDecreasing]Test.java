package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_[PricesDecreasing]

Test {

    @Test
    public void calculateSpans_[ PricesDecreasing]Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, -3, -2};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1,2,3]"));
    }

}