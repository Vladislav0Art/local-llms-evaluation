package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_[SingleElementPrices]

Test {

    @Test
    public void calculateSpans_[ SingleElementPrices]Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1]"));
    }

}