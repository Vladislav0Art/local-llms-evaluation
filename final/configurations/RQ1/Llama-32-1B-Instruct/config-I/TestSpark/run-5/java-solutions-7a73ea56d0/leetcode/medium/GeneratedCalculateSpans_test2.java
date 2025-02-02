package leetcode.medium;

public class GeneratedCalculateSpans_test2 {

    @Test
    public void calculateSpans_test2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 3, 5};
        int[] expectedResult = {1, 1, 2};
        onlineStockSpan.list = prices;
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedResult[0], result); // Test case 4
    }

}