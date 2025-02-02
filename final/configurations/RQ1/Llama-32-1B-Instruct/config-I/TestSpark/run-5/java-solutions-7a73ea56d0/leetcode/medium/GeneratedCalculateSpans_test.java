package leetcode.medium;

public class GeneratedCalculateSpans_test {

    @Test
    public void calculateSpans_test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 5};
        int[] expectedResult = {1, 1, 2};
        onlineStockSpan.list = prices;
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedResult[0], result); // Test case 4
    }

}