package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElementsArray_SamePrices_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementsArray_SamePrices_ReturnsCorrectSpans() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);

        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 10, 10});
        assertThat(result, is(new int[]{2, 1, 1}));
    }

}