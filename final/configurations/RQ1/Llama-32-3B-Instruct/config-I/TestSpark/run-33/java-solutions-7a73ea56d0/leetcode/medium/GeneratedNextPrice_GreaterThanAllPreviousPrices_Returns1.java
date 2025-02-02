package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedNextPrice_GreaterThanAllPreviousPrices_Returns1 {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_GreaterThanAllPreviousPrices_Returns1() {
        assertThat(onlineStockSpan.next(10), is(1));
    }

}