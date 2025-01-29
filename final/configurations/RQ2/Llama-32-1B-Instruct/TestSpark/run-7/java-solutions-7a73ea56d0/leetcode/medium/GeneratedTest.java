package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTest {

    @ParameterizedTest
    @CsvSource({
            "10,5,,",
            "15,3,4,7,"
    })
    void test_next_price_ints(int price, int nextPrice, String[] expected) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int actualNextPrice = onlineStockSpan.next(price);
        assertEquals(expected[1], actualNextPrice);
    }

    @ParameterizedTest
    @CsvSource({
            "100,50,0",
            "2000,-10,0"
    })
    void test_next_price_ints_negative(int price, int nextPrice, String[] expected) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int actualNextPrice = onlineStockSpan.next(price);
        assertEquals(expected[1], actualNextPrice);
    }

    @ParameterizedTest
    @CsvSource({
            "10,,5",
            "15,,3"
    })
    void test_next_price_ints_empty(int price, int nextPrice, String[] expected) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int actualNextPrice = onlineStockSpan.next(price);
        assertEquals(expected[1], actualNextPrice);
    }

    @ParameterizedTest
    @CsvSource({
            "10,,7",
            "15,,4"
    })
    void test_next_price_ints_single(int price, int nextPrice, String[] expected) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int actualNextPrice = onlineStockSpan.next(price);
        assertEquals(expected[1], actualNextPrice);
    }

    @Test
    public void test_calculateSpans_ints() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 15, 20};
        int[] expected = {5, 3, 2};
        int actualResult = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected[0], actualResult[0]);
    }

    @Test
    public void test_calculateSpans_ints_empty() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        int actualResult = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected[0], actualResult[0]);
    }

    @Test
    public void test_calculateSpans_ints_single() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int actualResult = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected[0], actualResult[0]);
    }

    @Test
    public void test_calculateSpans_ints_multiple() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 15, 20, 25};
        int[] expected = {5, 3, 2, 1};
        int actualResult = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected[0], actualResult[0]);
    }

    @ParameterizedTest
    @CsvSource({
            "100,50,8",
            "2000,-10,89"
    })
    void test_calculateSpans_ints_array(int[] prices, int[] expected) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int actualResult = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected[0], actualResult[0]);
    }

    @ParameterizedTest
    @CsvSource({
            "10,,7",
            "15,,4"
    })
    void test_calculateSpans_ints_single_array(int[] prices, int[] expected) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int actualResult = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected[0], actualResult[0]);
    }

    @ParameterizedTest
    @CsvSource({
            "10,,7",
            "15,,4"
    })
    void test_calculateSpans_ints_multiple_array(int[] prices, int[] expected) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int actualResult = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected[0], actualResult[0]);
    }

}