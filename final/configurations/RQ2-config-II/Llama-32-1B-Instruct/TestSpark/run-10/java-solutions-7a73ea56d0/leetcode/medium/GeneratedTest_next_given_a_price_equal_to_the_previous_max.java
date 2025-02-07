package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.jupiter.api.Test;

public class GeneratedTest_next_given_a_price_equal_to_the_previous_max {

    @Test
    public void test_next_given_a_price_equal_to_the_previous_max() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 1, price2 = 3;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price1); // Price is same as previous max
        assertEquals(4, onlineStockSpan.next(price1));
    }

}