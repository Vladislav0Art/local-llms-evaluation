package leetcode.medium;

public class GeneratedTest {

    private int[] prices;
    private int nextSpan;

    public int next(int price) {
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Prices cannot be null or empty");
        }
        if (price == null) {
            throw new IllegalArgumentException("Price cannot be null");
        }

        int left = 0;
        int right = prices.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (prices[mid] < price) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        nextSpan++;

        return prices.length - right;
    }

    public static int[] calculateSpans(int[] prices) {
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Prices cannot be null or empty");
        }

        OnlineStockSpan onlineStockSpan = new OnlineStockSpan(prices);
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = onlineStockSpan.next(i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {10, 20};
        int[] result = OnlineStockSpan.calculateSpans(prices);
        System.out.println(Arrays.toString(result));
    }
}

public class OnlineStockSpanTest {

}