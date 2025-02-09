package leetcode.medium;

public class GeneratedCalculateSpans_MockStack_Returns_CorrectSpans {


    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MockStack_Returns_CorrectSpans() {
        MockStack mockStack = new MockStack();
        onlineStockSpan.next(10);
        mockStack.push(10);
        onlineStockSpan.next(20);
        mockStack.push(20);
        onlineStockSpan.next(30);
        mockStack.push(30);
        int[] prices = {10, 20, 30};
        int[] expectedSpans = {1, 2, 3};
        result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

}