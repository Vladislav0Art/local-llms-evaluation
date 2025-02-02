package leetcode.medium;

public class GeneratedTestNextIsGreaterWhenPriceIncreases {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void testNextIsGreaterWhenPriceIncreases() {
        int price1 = 10;
        int price2 = 20;
        onlineStockSpan.next(price1);
        assertEquals(1, onlineStockSpan.list.size());
        onlineStockSpan.next(price2);
        assertEquals(2, onlineStockSpan.next(price2));
    }

}