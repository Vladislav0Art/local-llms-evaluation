package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class GeneratedNextPrice_ReturnsNextDaySpan_WhenSamePrice {

    @Test
    public void nextPrice_ReturnsNextDaySpan_WhenSamePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 10;
        int price2 = 10;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price2);
        assertThat(onlineStockSpan.next(price2), is(1));
    }

}