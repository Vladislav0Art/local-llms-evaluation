package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedNextPrice_IsSamePrice_Returns1 {

    @Test
    public void nextPrice_IsSamePrice_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertThat(result, is(1));
    }

}