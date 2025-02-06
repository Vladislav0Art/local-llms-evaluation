package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElementsArray_NoNext {

    @Test
    public void calculateSpans_MultipleElementsArray_NoNext() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            stockSpan.next(i);
        }
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(5, result[0]);
    }

}