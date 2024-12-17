package leetcode.medium;

public class GeneratedTestNextPriceNull {

    private int count = 1;

    public int next(int price) {
        if (price == null) return 0;
        count += 1;
        return count - 1;
    }

    public void reset() {
        count = 1;
    }
}

public class GeneratedTest {

    @Test
    public void testNextPriceNull() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int expectedCount = 0;

        for (int price : new int[]{null, 10, 7, 5, 8, 11}) {
            onlineStockSpan.next(price);
            assertEquals(expectedCount, onlineStockSpan.next());
            if (price != null) {
                expectedCount += 1;
            }
        }

        reset(onlineStockSpan);
    }

}