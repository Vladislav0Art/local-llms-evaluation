package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNextPriceWithSingleElementInList_ReturnsCorrectLengthArray {

    @Test
    public void nextPriceWithSingleElementInList_ReturnsCorrectLengthArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int[] result = onlineStockSpan.calculateSpans(new int[]{100});
        assertThat(result.length, is(1));
        assertThat(result[0], is(1));
    }

}