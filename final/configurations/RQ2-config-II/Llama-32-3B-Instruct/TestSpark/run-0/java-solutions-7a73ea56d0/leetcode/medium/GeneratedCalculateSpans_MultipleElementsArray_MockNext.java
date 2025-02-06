package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElementsArray_MockNext {

    @Test
    public void calculateSpans_MultipleElementsArray_MockNext() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Stack<Integer> stack = new Stack<>();
        when(stockSpan.next(anyInt())).thenReturn(stack.push((Integer) any()));
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(5, result[0]);
    }

}