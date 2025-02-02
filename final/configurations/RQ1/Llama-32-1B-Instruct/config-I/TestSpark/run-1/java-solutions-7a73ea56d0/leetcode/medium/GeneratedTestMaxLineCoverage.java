package leetcode.medium;

public class GeneratedTestMaxLineCoverage {

    @Test
    public void testMaxLineCoverage() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices1 = {7, 6, 4, 3, 1};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(7);
        onlineStockSpan.next(6);
        onlineStockSpan.next(4);
        onlineStockSpan.next(3);
        onlineStockSpan.next(1);
        int[] result1 = onlineStockSpan.calculateSpans(prices1);
        assertEquals(2, result1.length);
        assertEquals(5, result1[0]);
        assertEquals(1, result1[1]);

        int[] prices2 = {7, 6, 4, 3, 1, 8, 9};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(7);
        onlineStockSpan.next(6);
        onlineStockSpan.next(4);
        onlineStockSpan.next(3);
        onlineStockSpan.next(1);
        onlineStockSpan.next(8);
        onlineStockSpan.next(9);
        int[] result2 = onlineStockSpan.calculateSpans(prices2);
        assertEquals(5, result2.length);
        assertEquals(4, result2[0]);
        assertEquals(1, result2[1]);
        assertEquals(3, result2[2]);
        assertEquals(2, result2[3]);
        assertEquals(3, result2[4]);

    }

    public int[] calculateSpans(int[] prices) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int price : prices) {
            if (!list.isEmpty() && price >= list.get(list.size() - 1)) {
                count--;
            } else {
                list.add(1);
                count = 0;
            }
            onlineStockSpan.next(price);
        }

        return new int[]{count};
    }

}