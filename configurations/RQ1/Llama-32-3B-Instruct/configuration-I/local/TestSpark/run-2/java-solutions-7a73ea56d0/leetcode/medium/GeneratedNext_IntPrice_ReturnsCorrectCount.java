package leetcode.medium;

public class GeneratedNext_IntPrice_ReturnsCorrectCount {

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
    public void next_IntPrice_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int count = onlineStockSpan.next(price);
        assertEquals(1, count);
    }

}