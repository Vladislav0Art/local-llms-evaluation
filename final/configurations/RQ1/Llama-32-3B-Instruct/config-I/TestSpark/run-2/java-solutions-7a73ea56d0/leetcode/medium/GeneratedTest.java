package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testNextIsGreaterWhenPriceIncreases() {
        int price1 = 10;
        int price2 = 20;
        onlineStockSpan.next(price1);
        assertEquals(1, onlineStockSpan.list.size());
        onlineStockSpan.next(price2);
        assertEquals(2, onlineStockSpan.next(price2));
    }

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

    @Test
    public void testNextReturnsCorrectCountForSingleElementArray() {
        int price = 10;
        onlineStockSpan.next(price);
        assertEquals(1, onlineStockSpan.next(price));
    }

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