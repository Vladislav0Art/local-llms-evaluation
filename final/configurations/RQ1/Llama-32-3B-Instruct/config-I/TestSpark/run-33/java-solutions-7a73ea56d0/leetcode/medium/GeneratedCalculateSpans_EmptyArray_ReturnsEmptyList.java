package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyList {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyList() {
        assert onlineStockSpan.calculateSpans(new int[0]) == null;
    }

}