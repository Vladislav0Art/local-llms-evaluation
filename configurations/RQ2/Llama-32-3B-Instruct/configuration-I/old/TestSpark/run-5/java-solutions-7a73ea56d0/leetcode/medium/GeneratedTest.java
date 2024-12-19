package leetcode.medium;

public class GeneratedTest {

    private int[] prefixSum;

    public OnlineStockSpan() {
        this.prefixSum = new int[1];
    }

    public void add(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        int suffixSum = getSuffixSum();
        int delta = Math.max(0, suffixSum - price);
        int[] temp = new int[prefixSum.length + 1];
        System.arraycopy(prefixSum, 0, temp, 0, prefixSum.length);
        temp[prefixSum.length] = delta;
        this.prefixSum = temp;
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

}