package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTest_calculateSpans_ints {

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

}