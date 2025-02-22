package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class GeneratedCalculateSpansTest1 {

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] spans = oss.calculateSpans(prices);
        assertThat(spans.length, is(3));
        assertThat(spans[0], is(1));
        assertThat(spans[1], is(2));
        assertThat(spans[2], is(3));
    }

}