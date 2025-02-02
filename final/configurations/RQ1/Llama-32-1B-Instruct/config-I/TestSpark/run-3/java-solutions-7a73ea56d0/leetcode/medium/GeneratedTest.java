package leetcode.medium;

public class GeneratedTest {

    @Test
    public void test_next_Pricing_AntiIncreasing() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int expected = 2;
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        onlineStockSpan.next(3);
        assertEquals(expected, onlineStockSpan.next(prices));
    }

    @Test
    public void test_next_Pricing_Increasing() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 3};
        int expected = 2;
        onlineStockSpan.next(2);
        assertEquals(expected, onlineStockSpan.next(prices));
    }

    @Test
    public void test_next_Pricing_Downward_Increasing() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 4};
        int expected = 3;
        onlineStockSpan.next(2);
        onlineStockSpan.next(3);
        assertEquals(expected, onlineStockSpan.next(prices));
    }

    @Test
    public void test_next_Pricing_Downward_Greedy() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 4};
        int expected = 2;
        onlineStockSpan.next(3);
        assertEquals(expected, onlineStockSpan.next(prices));
    }

    @Test
    public void test_calculateSpans_EmptyList() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        OnlineStockSpan.Spans[] expected = {0};
        int actual = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void test_calculateSpans_MultiplePricingPoints() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        OnlineStockSpan.Spans[] expected = {2, 1, 1};
        int actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_calculateSpans_MultiplePricingPoints_PushBackToTop() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        OnlineStockSpan.Spans[] expected = {4, 3, 2, 1};
        for (int i : prices) {
            onlineStockSpan.next(i);
        }
        OnlineStockSpan.Spans actual = new ArrayList<>();
        onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_calculateSpans_MultiplePricingPoints_PushBackToTop_CycleDetection() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4};
        onlineStockSpan.next(5);
        assertEquals(5, onlineStockSpan.next(prices));
    }

}