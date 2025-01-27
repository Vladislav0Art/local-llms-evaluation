package leetcode.medium;

public class GeneratedTest {

    private int pointer;

    public OnlineStockSpan() {
    }

    public int next(int price) {
        return 1;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = 1;
        }
        return result;
    }
}

public class GeneratedTest {

    public static void main(String[] args) {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        System.out.println(stockSpan.next(100)); // prints: 1
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, stockSpan.calculateSpans(new int[]{1, 2, 3, 4, 5}));
    }

}