package leetcode.medium;

public class GeneratedTestCalculateSpans_MultiplePrices_NoCoverage_2 {

    @Test
    public void testCalculateSpans_MultiplePrices_NoCoverage_2() {
        int[] prices = {5, 10, 20};
        int[] expected = {-1, -4, -6};
        int[] result = newOnlineStockSpan().calculateSpans(prices);
        assertEquals(expected, result);
    }

}