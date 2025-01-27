package leetcode.medium;

public class GeneratedTestNext {

    private int pointer;

    public OnlineStockSpan(int initialPointer) {
        this.pointer = initialPointer;
    }

    public int next(int price) {
        return pointer + 1;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = pointer - prices[i] + 1;
        }
        return result;
    }
}

public class GeneratedTest {

    @Test
    public void testNext() {
        OnlineStockSpan stockSpan = new OnlineStockSpan(100);
        assertEquals(1, stockSpan.next(100));
    }

}