package leetcode.medium;

public class GeneratedCalculateSpans_DuplicateElementsArray_Returns_CorrectSpans {


    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_DuplicateElementsArray_Returns_CorrectSpans() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        onlineStockSpan.next(30);
        int[] prices = {10, 20, 30, 30};
        int[] expectedSpans = {1, 2, 3, 4};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    private static class MockNext {

        public int next(int price) {
            return 0;
        }
    }

}