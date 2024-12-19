package leetcode.medium;

public class GeneratedTestCalculateSpansWithTwoElements {

    @Test
    public void testCalculateSpansWithTwoElements() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int expected = new int[]{3, 2, 1};
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}