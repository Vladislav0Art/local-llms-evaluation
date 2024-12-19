package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNext_Div1_PricePositiveIntReturnsCorrectValue {

    @Test
    public void next_Div1_PricePositiveIntReturnsCorrectValue() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(10);
        assertThat(result, is(1));
    }

}