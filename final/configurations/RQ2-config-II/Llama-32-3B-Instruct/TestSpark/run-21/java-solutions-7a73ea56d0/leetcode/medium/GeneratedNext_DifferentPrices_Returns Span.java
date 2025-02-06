package leetcode.medium;

public class GeneratedNext_DifferentPrices_Returns Span {

    @Test
    public void next_DifferentPrices_Returns

    Span() {
        OnlineStockSpan onlineStackSpan = new OnlineStackSpan();
        onlineStackSpan.priceStack.push(-2);
        onlineStackSpan.stockPriceStack.push(-2);
        int result = onlineStackSpan.next(0);
        assertEquals(1, result);
        onlineStackSpan.priceStack.push(0);
        onlineStackSpan.stockPriceStack.push(0);
        result = onlineStackSpan.next(1);
        assertNotEquals(1, result);
    }

}