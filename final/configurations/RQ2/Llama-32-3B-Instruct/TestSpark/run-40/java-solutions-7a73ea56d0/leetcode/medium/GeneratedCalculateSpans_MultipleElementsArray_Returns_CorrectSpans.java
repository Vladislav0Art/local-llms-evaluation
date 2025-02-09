package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElementsArray_Returns_CorrectSpans {


    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementsArray_Returns_CorrectSpans() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        int[] prices = {10, 20, 30};
        int[] expectedSpans = {1, 2, 3};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}