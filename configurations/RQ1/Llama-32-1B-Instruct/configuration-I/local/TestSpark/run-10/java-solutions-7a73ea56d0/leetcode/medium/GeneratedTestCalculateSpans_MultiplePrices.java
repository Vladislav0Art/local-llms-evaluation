package leetcode.medium;

public class GeneratedTestCalculateSpans_MultiplePrices {

    @Test
    public void testCalculateSpans_MultiplePrices() {
        int[] prices = {1, 2, 3};
        int[] expected = {1, 1, 2};
        int[] result = newOnlineStockSpan().calculateSpans(prices);
        assertEquals(expected, result);
    }

}