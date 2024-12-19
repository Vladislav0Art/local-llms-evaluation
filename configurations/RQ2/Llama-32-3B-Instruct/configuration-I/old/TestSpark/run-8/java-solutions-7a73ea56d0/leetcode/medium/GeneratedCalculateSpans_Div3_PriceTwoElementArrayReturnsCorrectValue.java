package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_Div3_PriceTwoElementArrayReturnsCorrectValue {

    @Test
    public void calculateSpans_Div3_PriceTwoElementArrayReturnsCorrectValue() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20};
        int[] result = solution.calculateSpans(prices);
        assertThat(Arrays.asList(result), is(new int[]{1, 1}));
    }

}