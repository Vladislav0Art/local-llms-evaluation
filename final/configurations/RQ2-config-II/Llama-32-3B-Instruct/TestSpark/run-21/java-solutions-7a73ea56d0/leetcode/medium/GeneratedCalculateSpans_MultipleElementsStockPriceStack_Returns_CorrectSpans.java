package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElementsStockPriceStack_Returns_CorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsStockPriceStack_Returns_CorrectSpans() {
        OnlineStockSpan onlineStackSpan = new OnlineStackSpan();
        for (int i = 1; i <= 4; i++) {
            int price = i;
            int result = onlineStackSpan.next(price);
            onlineStackSpan.stockPriceStack.push(price);
            when(onlineStackSpan.priceStack).thenReturn(new Stack<>());
            when(onlineStackSpan.stockPriceStack).thenReturn(new Stack<>());
            int[] spans = onlineStackSpan.calculateSpans(new int[]{});
            assertEquals(0, spans[0]);
            assertEquals(result, spans[1]);
        }
    }

}