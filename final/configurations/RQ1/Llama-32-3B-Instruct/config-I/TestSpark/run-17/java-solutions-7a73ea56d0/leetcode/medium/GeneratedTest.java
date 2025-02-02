package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void next_MoreThanOnePriceSameDay_ReturnsMoreThanOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 1};
        int result = onlineStockSpan.next(2);
        assertThat(result, is(2));
    }

    @Test
    public void next_LessThanCurrentPrice_ReturnsCountFromTop() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {2, 1};
        int result = onlineStockSpan.next(1);
        assertThat(result, is(1));
    }

    @Test
    public void calculateSpans_DifferentPrices_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60, 85};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result[0], is(1));
        assertThat(result[1], is(1));
        assertThat(result[2], is(2));
        assertThat(result[3], is(4));
        assertThat(result[4], is(5));
        assertThat(result[5], is(6));
    }

    @Test
    public void calculateSpans_SamePrice_DifferentDays_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result[0], is(1));
        assertThat(result[1], is(2));
        assertThat(result[2], is(3));
        assertThat(result[3], is(4));
        assertThat(result[4], is(5));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result.length, is(0));
    }

}