package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void test_next_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(5);
        assertEquals(1, onlineStockSpan.next(5));
    }

    @Test
    public void test_calculateSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 200};
        onlineStockSpan.prices = prices;
        onlineStockSpan.init();
        assertEquals(2, onlineStockSpan.count);
        assertEquals(1, onlineStockSpan.maxSubArrayLength);
    }

    @Test
    public void test_count() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100, 200, 300};
        onlineStockSpan.init();
        assertEquals(3, onlineStockSpan.count);
        assertEquals(1, onlineStockSpan.maxSubArrayLength);
    }

    @Test
    public void test_maxSubArrayLength() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100, 200, -200};
        onlineStockSpan.init();
        assertEquals(2, onlineStockSpan.maxSubArrayLength);
    }

    @Test
    public void test_init_with_single_price() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100};
        onlineStockSpan.init();
        assertEquals(1, onlineStockSpan.count);
        assertEquals(0, onlineStockSpan.maxSubArrayLength);
    }

    @Test
    public void test_init_with_multiple_prices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100, 200};
        onlineStockSpan.init();
        assertEquals(2, onlineStockSpan.count);
        assertEquals(1, onlineStockSpan.maxSubArrayLength);
    }

    @Test
    public void test_init_with_no_prices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.init();
        assertEquals(0, onlineStockSpan.count);
        assertEquals(0, onlineStockSpan.maxSubArrayLength);
    }

    @Test
    public void test_calculateSpans_with_single_price() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100};
        onlineStockSpan.init();
        assertEquals(1, onlineStockSpan.count);
        assertEquals(0, onlineStockSpan.maxSubArrayLength);
    }

    @Test
    public void test_calculateSpans_with_multiple_prices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100, 200};
        onlineStockSpan.init();
        assertEquals(2, onlineStockSpan.count);
        assertEquals(1, onlineStockSpan.maxSubArrayLength);
    }

    @Test
    public void test_calculateSpans_with_no_prices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.init();
        assertEquals(0, onlineStockSpan.count);
        assertEquals(0, onlineStockSpan.maxSubArrayLength);
    }

}