package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNext[LowestPriceFirst]

ReturnsCorrectSpan {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next[ LowestPriceFirst]ReturnsCorrectSpan() {
        onlineStockSpan.list.clear();
        onlineStockSpan.next(5);
        onlineStockSpan.next(4);
        onlineStockSpan.next(3);
        assertThat(onlineStockSpan.next(2), is(1));
        assertThat(onlineStockSpan.next(7), is(2));
    }

}