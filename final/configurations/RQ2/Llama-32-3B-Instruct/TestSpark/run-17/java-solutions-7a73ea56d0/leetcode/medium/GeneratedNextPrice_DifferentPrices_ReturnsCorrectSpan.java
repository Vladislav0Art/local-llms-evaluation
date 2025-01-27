package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedNextPrice_DifferentPrices_ReturnsCorrectSpan {

    @Test
    public void nextPrice_DifferentPrices_ReturnsCorrectSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(150);
        assertThat(result, is(2));
    }

}