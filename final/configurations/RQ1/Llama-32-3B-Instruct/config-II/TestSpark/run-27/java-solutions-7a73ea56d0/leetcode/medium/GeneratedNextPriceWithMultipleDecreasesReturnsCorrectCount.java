package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNextPriceWithMultipleDecreasesReturnsCorrectCount {

    @Test
    public void nextPriceWithMultipleDecreasesReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(90);
        onlineStockSpan.next(85);
        assertThat(onlineStockSpan.list, containsExactly(100, 90, 85));
    }

}