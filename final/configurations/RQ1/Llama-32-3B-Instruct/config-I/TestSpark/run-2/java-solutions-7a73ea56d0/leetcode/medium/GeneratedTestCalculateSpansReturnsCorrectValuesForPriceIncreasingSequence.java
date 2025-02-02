package leetcode.medium;

public class GeneratedTestCalculateSpansReturnsCorrectValuesForPriceIncreasingSequence {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void testCalculateSpansReturnsCorrectValuesForPriceIncreasingSequence() {
        List<Integer> list = new ArrayList<>();
        int price1 = 10;
        int price2 = 20;
        int price3 = 30;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price2);
        onlineStockSpan.next(price3);
        int[] result = onlineStockSpan.calculateSpans(new int[]{price1, price2, price3});
        assertEquals(new int[]{2, 3, 4}, result);
    }

}