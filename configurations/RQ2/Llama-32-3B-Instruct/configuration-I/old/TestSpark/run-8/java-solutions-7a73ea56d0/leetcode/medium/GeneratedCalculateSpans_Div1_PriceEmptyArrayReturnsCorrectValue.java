package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_Div1_PriceEmptyArrayReturnsCorrectValue {

    @Test
    public void calculateSpans_Div1_PriceEmptyArrayReturnsCorrectValue() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertThat(Arrays.asList(result), is(new int[0]));
    }

}