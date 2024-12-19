package leetcode.medium;

public class GeneratedTestNextPriceDecrease {

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
    public void testNextPriceDecrease() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int expectedCount = -2;

        for (int price : new int[]{-100, -7, -5, -8, -11}) {
            onlineStockSpan.next(price);
            assertEquals(expectedCount, onlineStockSpan.next());
            expectedCount += 1;
        }

        reset(onlineStockSpan);
    }

}