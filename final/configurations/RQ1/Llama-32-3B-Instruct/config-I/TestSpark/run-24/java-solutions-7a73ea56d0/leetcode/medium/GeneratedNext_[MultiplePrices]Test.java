package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNext_[MultiplePrices]

Test {

    @Test
    public void next_[ MultiplePrices]Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, -3, -2, -4};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = onlineStockSpan.next(prices[i]);
        }
        assertThat(Arrays.toString(result), is("[1,2,3,4]"));
    }

}