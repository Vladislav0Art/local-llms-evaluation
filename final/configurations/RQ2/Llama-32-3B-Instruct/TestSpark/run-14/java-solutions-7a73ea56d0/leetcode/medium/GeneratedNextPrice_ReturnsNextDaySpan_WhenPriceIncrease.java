package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class GeneratedNextPrice_ReturnsNextDaySpan_WhenPriceIncrease {

    @Test
    public void nextPrice_ReturnsNextDaySpan_WhenPriceIncrease() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int expectedSpan = 1;
        onlineStockSpan.next(price);
        assertThat(onlineStockSpan.next(price), is(expectedSpan));
    }

}