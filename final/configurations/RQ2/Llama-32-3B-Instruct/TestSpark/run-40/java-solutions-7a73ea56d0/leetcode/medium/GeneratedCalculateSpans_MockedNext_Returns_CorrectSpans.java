package leetcode.medium;

public class GeneratedCalculateSpans_MockedNext_Returns_CorrectSpans {


    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MockedNext_Returns_CorrectSpans() {
        MockNext mockNext = new MockNext();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        mockNext.next(40);
        int[] prices = {10, 20, 30, 40};
        int[] expectedSpans = {1, 2, 3, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

    private static class MockStack {

        public void push(int price) {
        }

        public int pop() {
            return 0;
        }
    }

}