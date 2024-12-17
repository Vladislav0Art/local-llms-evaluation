package leetcode.medium;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

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
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, result);
    }

}