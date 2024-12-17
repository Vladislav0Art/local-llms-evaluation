package leetcode.medium;

public class GeneratedTest_next_PricingPriceEqualsCurrent {

    @Test
    public void test_next_PricingPriceEqualsCurrent() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);

        assertEquals(3, onlineStockSpan.next(4));
    }

}