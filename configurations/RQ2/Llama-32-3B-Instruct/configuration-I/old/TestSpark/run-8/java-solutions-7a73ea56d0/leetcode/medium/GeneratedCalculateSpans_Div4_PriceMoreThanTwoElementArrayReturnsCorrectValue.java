package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_Div4_PriceMoreThanTwoElementArrayReturnsCorrectValue {

    @Test
    public void calculateSpans_Div4_PriceMoreThanTwoElementArrayReturnsCorrectValue() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] result = solution.calculateSpans(prices);
        assertThat(Arrays.asList(result), is(new int[]{1, 2, 3}));
    }

}