package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertThat((int) result[0], is(1));
    }

}