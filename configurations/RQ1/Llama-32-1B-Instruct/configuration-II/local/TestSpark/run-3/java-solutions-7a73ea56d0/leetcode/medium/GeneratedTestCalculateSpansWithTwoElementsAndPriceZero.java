package leetcode.medium;

public class GeneratedTestCalculateSpansWithTwoElementsAndPriceZero {

    @Test
    public void testCalculateSpansWithTwoElementsAndPriceZero() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10, 0};
        int expected = new int[]{2, 1};
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}