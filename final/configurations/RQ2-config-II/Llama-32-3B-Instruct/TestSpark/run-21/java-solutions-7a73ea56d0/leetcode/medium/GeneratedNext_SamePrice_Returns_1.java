package leetcode.medium;

public class GeneratedNext_SamePrice_Returns_1 {

    @Test
    public void next_SamePrice_Returns_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        onlineStackSpan.priceStack.push(-2);
        onlineStackSpan.stockPriceStack.push(-2);
        int result = onlineStackSpan.next(-2);
        assertEquals(1, result);
    }

}