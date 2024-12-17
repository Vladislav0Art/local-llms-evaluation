package leetcode.medium;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

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
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}