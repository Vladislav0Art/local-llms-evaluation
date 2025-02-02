package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_[PricesIncreasing]

Test {

    @Test
    public void calculateSpans_[ PricesIncreasing]Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-5, -4, -3};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1,2,3]"));
    }

}