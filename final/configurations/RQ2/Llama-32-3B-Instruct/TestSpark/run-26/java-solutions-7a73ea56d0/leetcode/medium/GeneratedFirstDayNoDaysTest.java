package leetcode.medium;

public class GeneratedFirstDayNoDaysTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void firstDayNoDaysTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{});
        assertEquals(new int[]{0}, result);
    }

}