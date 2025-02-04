package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNextPriceReturnsCorrectCount {

    @Test
    public void nextPriceReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(75);
        assertThat(onlineStockSpan.list, containsExactly(100, 80, 75));
    }

}