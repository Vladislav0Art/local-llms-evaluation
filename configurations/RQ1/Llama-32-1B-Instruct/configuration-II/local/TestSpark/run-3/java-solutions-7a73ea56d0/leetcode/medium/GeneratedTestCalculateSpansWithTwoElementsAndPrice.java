package leetcode.medium;

public class GeneratedTestCalculateSpansWithTwoElementsAndPrice {

    @Test
    public void testCalculateSpansWithTwoElementsAndPrice() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10, 20};
        int expected = new int[]{2, 1};
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}