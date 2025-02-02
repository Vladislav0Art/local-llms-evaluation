package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        onlineStockSpan.next(5);
        onlineStockSpan.next(6);
        onlineStockSpan.next(7);
        onlineStockSpan.next(8);
        onlineStockSpan.next(9);

        int[] result = onlineStockSpan.calculateSpans(new int[]{5, 6, 7, 8, 9});
        assertThat(result, is(new int[]{2, 3, 4, 5, 6}));
    }

}