package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] prices = {3, 2, 1};
        int[] spans = oss.calculateSpans(prices);
        assertThat(spans.length, is(3));
        assertThat(spans[0], is(1));
        assertThat(spans[1], is(1));
        assertThat(spans[2], is(1));
    }

}