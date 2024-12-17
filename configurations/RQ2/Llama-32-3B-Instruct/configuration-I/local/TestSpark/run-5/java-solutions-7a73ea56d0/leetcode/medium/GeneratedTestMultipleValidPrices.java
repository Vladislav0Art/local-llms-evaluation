package leetcode.medium;

public class GeneratedTestMultipleValidPrices {

    private int[] prefixSum;

    public OnlineStockSpan() {
        prefixSum = new int[0];
    }

    public void add(int price) {
        int suffixSum = getSuffixSum();
        int delta = Math.max(0, suffixSum - price);
        prefixSum = Arrays.copyOf(prefixSum, prefixSum.length + 1);
        prefixSum[prefixSum.length - 1] = delta;
    }

    private int getSuffixSum() {
        return prefixSum[prefixSum.length - 1];
    }

    public int next(int price) {
        add(price);
        return prefixSum[prefixSum.length - 1];
    }
}

public class OnlineStockSpanTest {

    @Test
    public void testMultipleValidPrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(200);
        assertEquals(3, stockSpan.next(300));
        assertEquals(4, stockSpan.next(400));
    }

}