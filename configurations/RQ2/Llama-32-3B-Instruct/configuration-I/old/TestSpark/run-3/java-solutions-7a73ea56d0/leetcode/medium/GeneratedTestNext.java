package leetcode.medium;

public class GeneratedTestNext {

    private int[] prices;
    private int index;

    public void update(int price) {
        if (prices.length == 0 || price != prices[index]) {
            prices = new int[++index];
            prices[index] = price;
        } else {
            prices[index] = price;
        }
    }

    public int next() {
        if (index == 0) {
            return 1;
        }
        // logic to calculate the span based on previous price
        for (int i = index - 1; i >= 0; i--) {
            if (prices[i] != prices[index]) {
                return index - getPreviousPriceIndex();
            }
        }
        return index + 1;
    }

    private int getPreviousPriceIndex() {
        for (int i = index - 1; i >= 0; i--) {
            if (prices[i] != prices[index]) {
                return i;
            }
        }
        return 0;
    }

    public static int[] calculateSpans(int[] prices) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int price : prices) {
            onlineStockSpan.update(price);
        }
        int[] spans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            spans[i] = onlineStockSpan.next();
        }
        return spans;
    }

}

public class GeneratedTest {

    @Test
    public void testNext() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.update(10);
        assertEquals(2, onlineStockSpan.next());
    }

}