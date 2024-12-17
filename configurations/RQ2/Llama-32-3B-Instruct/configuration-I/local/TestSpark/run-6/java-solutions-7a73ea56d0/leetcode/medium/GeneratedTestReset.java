package leetcode.medium;

public class GeneratedTestReset {

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
    public void testReset() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int expectedCount = 1;

        for (int price : new int[]{10, 7, 5, 8, 11}) {
            onlineStockSpan.next(price);
        }

        assertEquals(expectedCount, onlineStockSpan.next());
    }

}