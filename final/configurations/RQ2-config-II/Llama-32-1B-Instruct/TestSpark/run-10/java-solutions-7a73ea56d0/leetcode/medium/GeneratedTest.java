package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void test_next_given_a_price_less_than_the_previous_max() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 1, price2 = 3;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price2);
        assertEquals(2, onlineStockSpan.next(price2));
    }

    @Test
    public void test_next_given_a_price_equal_to_the_previous_max() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 1, price2 = 3;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price1); // Price is same as previous max
        assertEquals(4, onlineStockSpan.next(price1));
    }

    @Test
    public void test_next_given_a_price_greater_than_the_previous_max() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 2, price2 = 3;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price2);
        assertEquals(5, onlineStockSpan.next(price2));
    }

    @Test
    public void test_calculateSpans_given_a_price_and_the_previous_max() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 10, 1, 7};
        onlineStockSpan.calculateSpans(prices);
        System.out.println(java.util.Arrays.toString(onlineStockSpan.calculateSpans(prices)));
    }

    @Test
    public void test_calculateSpans_given_all_prices_equal_to_the_previous_max() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 10, 1, 7};
        onlineStockSpan.calculateSpans(prices);
        System.out.println(java.util.Arrays.toString(onlineStockSpan.calculateSpans(prices)));
    }

    @Test
    public void test_calculateSpans_given_all_prices_equal_to_the_previous_max_with_stocks() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 10, 1, 7};
        onlineStockSpan.calculateSpans(prices);
        System.out.println(java.util.Arrays.toString(onlineStockSpan.calculateSpans(prices)));
    }

}