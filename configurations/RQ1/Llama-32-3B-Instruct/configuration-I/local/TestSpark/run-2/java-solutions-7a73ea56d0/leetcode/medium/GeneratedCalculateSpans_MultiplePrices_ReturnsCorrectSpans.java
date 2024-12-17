package leetcode.medium;

public class GeneratedCalculateSpans_MultiplePrices_ReturnsCorrectSpans {

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
    public void calculateSpans_MultiplePrices_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan(); // Corrected class name here
        int[] prices = {10, 7, 5, 8, 11, 9};
        onlineStockSpan.next(10);
        onlineStockSpan.next(7);
        onlineStockSpan.next(5);
        onlineStockSpan.next(8);
        onlineStockSpan.next(11);
        onlineStockSpan.next(9);

        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 7}, result);
    }
}

}