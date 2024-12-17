package leetcode.medium;

public class GeneratedTest_next_PricingPriceLessThanCurrent {

    @Test
    public void test_next_PricingPriceLessThanCurrent() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);

        assertEquals(3, onlineStockSpan.next(4));
    }

}