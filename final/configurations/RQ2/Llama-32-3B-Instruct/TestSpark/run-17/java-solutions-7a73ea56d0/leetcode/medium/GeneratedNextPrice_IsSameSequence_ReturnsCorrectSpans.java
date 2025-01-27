package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedNextPrice_IsSameSequence_ReturnsCorrectSpans {

    @Test
    public void nextPrice_IsSameSequence_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};
        for (int price : prices) {
            int result = stockSpan.next(price);
            assertThat(result, is(stockSpan.calculateSpans(new int[]{price})));
        }
    }

}