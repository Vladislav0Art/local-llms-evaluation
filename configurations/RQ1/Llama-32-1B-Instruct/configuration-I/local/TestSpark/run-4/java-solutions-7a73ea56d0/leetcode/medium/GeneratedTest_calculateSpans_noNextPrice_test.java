package leetcode.medium;

public class GeneratedTest_calculateSpans_noNextPrice_test {

    @Test
    public void test_calculateSpans_noNextPrice_test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        OnlineStockSpan.ScenarioTest scenarioTest = new OnlineStockSpan.ScenarioTest(prices);
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{2}, result);

        prices = new int[]{100, 200, 300};
        result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{3, 4, 5}, result);
    }

}