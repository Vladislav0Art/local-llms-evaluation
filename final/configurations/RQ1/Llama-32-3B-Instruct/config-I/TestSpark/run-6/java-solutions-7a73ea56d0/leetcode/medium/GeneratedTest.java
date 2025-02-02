package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next[
    IntPrice]

    ReturnsCorrectSpan() {
        assertThat(onlineStockSpan.next(10), is(1));
    }

    @Test
    public void next[
    LowestPriceFirst]

    ReturnsCorrectSpan() {
        onlineStockSpan.list.clear();
        onlineStockSpan.next(5);
        onlineStockSpan.next(4);
        onlineStockSpan.next(3);
        assertThat(onlineStockSpan.next(2), is(1));
        assertThat(onlineStockSpan.next(7), is(2));
    }

    @Test
    public void next[
    PriceOfFirstDay]

    ReturnsCorrectSpan() {
        onlineStockSpan.list.clear();
        onlineStockSpan.next(10);
        assertThat(onlineStockSpan.next(10), is(1));
    }

    @Test
    public void calculateSpans[
    EquivToNext][Scenario]

    Test() {
        int[] prices = {100, 80, 75, 60, 55, 65, 77, 90};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans[
    AllSamePrice]

    ReturnsCorrectSpans() {
        int[] prices = {100, 100, 100, 100};
        int[] expectedSpans = {1, 2, 3, 4};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans[
    PriceIncreases]

    ReturnsCorrectSpans() {
        int[] prices = {100, 120, 80, 75, 60, 55, 65, 77, 90};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans[
    PriceDecreases]

    ReturnsCorrectSpans() {
        int[] prices = {100, 80, 75, 70, 65, 60, 55};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans[
    FirstPrice]

    ReturnsCorrectSpans() {
        int[] prices = {100};
        int[] expectedSpans = {1};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans[
    NegativePrice]

    ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> onlineStockSpan.calculateSpans(new int[]{100, -80}));
    }

}