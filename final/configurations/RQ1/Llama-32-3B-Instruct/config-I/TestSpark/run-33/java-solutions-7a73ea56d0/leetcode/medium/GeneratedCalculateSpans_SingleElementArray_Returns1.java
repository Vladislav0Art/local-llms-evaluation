package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_Returns1 {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementArray_Returns1() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertThat((int) result[0], is(1));
    }

}