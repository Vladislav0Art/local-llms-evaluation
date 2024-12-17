package leetcode.medium;

public class GeneratedNext_MultiplePrices_SpanComputedCorrectly {

    private List<Integer> list;

    public OnlineStockSpan() {
        this.list = new ArrayList<>();
    }

    public int next(int price) {
        list.add(list.size());
        return list.size();
    }

    public int[] calculateSpans(int[] prices) {
        for (int price : prices) {
            this.next(price);
        }
        return Arrays.copyOfRange(list.toArray(), 0, list.size() - prices.length + 1);
    }

}

public class OnlineStockSpanTest {

    @Test
    public void next_MultiplePrices_SpanComputedCorrectly() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(6, result.length);
        Arrays.sort(result);
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6}), Arrays.toString(result));
    }

}