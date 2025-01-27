package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedNextPrice_MultipleSamePrices_ReturnsCorrectSpans {

    @Test
    public void nextPrice_MultipleSamePrices_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            int result = stockSpan.next(100);
            assertThat(result, is(i + 1));
        }
    }

}