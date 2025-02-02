package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void next_[
    PriceZero]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertThat(onlineStockSpan.next(0), is(1));
    }

    @Test
    public void next_[
    PriceNegative]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertThat(onlineStockSpan.next(-1), is(1));
    }

    @Test
    public void next_[
    MultiplePrices]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, -3, -2, -4};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = onlineStockSpan.next(prices[i]);
        }
        assertThat(Arrays.toString(result), is("[1,2,3,4]"));
    }

    @Test
    public void calculateSpans_[
    EmptyPrices]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result.length, is(0));
    }

    @Test
    public void calculateSpans_[
    SingleElementPrices]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1]"));
    }

    @Test
    public void calculateSpans_[
    MultiplePrices]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, -3, -2, -4};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1,2,3,4]"));
    }

    @Test
    public void calculateSpans_[
    PricesDecreasing]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, -3, -2};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1,2,3]"));
    }

    @Test
    public void calculateSpans_[
    PricesIncreasing]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-5, -4, -3};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1,2,3]"));
    }

    @Test
    public void calculateSpans_[
    PricesMixedDecreasingAndIncreasing]

    Test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-5, -4, 3, 0, 5};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[1,2,3,2,1]"));
    }

}