package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_[EmptyPrices]

Test {

    @Test
    public void calculateSpans_[ EmptyPrices]Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result.length, is(0));
    }

}