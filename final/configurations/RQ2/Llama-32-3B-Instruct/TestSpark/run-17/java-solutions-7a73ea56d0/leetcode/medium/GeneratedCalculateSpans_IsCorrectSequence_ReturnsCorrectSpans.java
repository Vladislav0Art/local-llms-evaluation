package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_IsCorrectSequence_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_IsCorrectSequence_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};
        for (int i = 0; i < prices.length - 1; i++) {
            int result = stockSpan.calculateSpans(new int[]{prices[i], prices[i + 1]});
            assertThat(result[0], is(1));
            assertThat(result[1], is(2));
        }
    }

}