package leetcode.medium;

public class GeneratedTestCalculateSpansWorksWithMultipleElementsArray {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void testCalculateSpansWorksWithMultipleElementsArray() {
        List<Integer> list = new ArrayList<>();
        int price1 = 10;
        int price2 = 5;
        int price3 = 8;
        int price4 = 3;
        onlineStockSpan.next(price1);
        onlineStockSpan.next(price2);
        onlineStockSpan.next(price3);
        onlineStockSpan.next(price4);
        int[] result = onlineStockSpan.calculateSpans(new int[]{price1, price2, price3, price4});
        assertEquals(new int[]{2, 1, 1, 4}, result);
    }

}