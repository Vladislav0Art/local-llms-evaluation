package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedNextPrice_SameAsPreviousDay_Returns2 {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_SameAsPreviousDay_Returns2() {
        onlineStockSpan.next(5);
        int result = (int) onlineStockSpan.next(5);
        assertThat(result, is(2));
    }

}