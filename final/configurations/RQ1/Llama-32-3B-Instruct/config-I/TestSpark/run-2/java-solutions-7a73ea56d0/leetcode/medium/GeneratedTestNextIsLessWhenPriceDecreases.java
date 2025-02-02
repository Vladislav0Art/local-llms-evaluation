package leetcode.medium;

public class GeneratedTestNextIsLessWhenPriceDecreases {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void testNextIsLessWhenPriceDecreases() {
        int price1 = 10;
        int price2 = 5;
        List<Integer> list = new ArrayList<>();
        list.add(price1);
        onlineStockSpan.list = list;
        onlineStockSpan.next(price1);
        assertEquals(1, onlineStockSpan.list.size());
        onlineStockSpan.next(price2);
        onlineStockSpan.next(price1);
        assertEquals(2, onlineStockSpan.next(price2));
    }

}