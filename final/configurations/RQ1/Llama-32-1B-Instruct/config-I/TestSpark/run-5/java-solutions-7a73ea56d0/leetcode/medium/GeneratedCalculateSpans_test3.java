package leetcode.medium;

public class GeneratedCalculateSpans_test3 {

    @Test
    public void calculateSpans_test3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {2, 1, 7};
        int[] expectedResult = {1, 1, 1};
        onlineStockSpan.list = prices;
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedResult[0], result); // Test case 4
    }

}