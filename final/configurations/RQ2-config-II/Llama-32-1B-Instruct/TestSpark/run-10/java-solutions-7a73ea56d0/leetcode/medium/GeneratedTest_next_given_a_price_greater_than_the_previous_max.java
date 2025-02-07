package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.jupiter.api.Test;

public class GeneratedTest_next_given_a_price_greater_than_the_previous_max {

    @Test
    public void test_next_given_a_price_greater_than_the_previous_max() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 2, price2 = 3;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price2);
        assertEquals(5, onlineStockSpan.next(price2));
    }

}