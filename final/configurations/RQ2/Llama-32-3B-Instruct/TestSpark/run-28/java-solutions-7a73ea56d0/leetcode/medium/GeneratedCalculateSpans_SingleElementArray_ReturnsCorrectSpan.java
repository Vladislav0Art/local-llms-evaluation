package leetcode.medium;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        // given
        int[] prices = {100};
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertArrayEquals(new int[]{1}, result);
    }

}