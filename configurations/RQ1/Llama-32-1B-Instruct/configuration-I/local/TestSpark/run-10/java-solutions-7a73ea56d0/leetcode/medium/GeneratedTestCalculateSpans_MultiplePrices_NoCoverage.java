package leetcode.medium;

public class GeneratedTestCalculateSpans_MultiplePrices_NoCoverage {

    @Test
    public void testCalculateSpans_MultiplePrices_NoCoverage() {
        int[] prices = {5, 10, 20, 30};
        int[] expected = {-1, -3, -4};
        int[] result = newOnlineStockSpan().calculateSpans(prices);
        assertEquals(expected, result);
    }

}