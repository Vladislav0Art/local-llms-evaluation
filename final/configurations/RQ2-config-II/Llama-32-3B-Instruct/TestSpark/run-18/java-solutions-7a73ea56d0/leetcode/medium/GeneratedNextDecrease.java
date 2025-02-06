package leetcode.medium;

public class GeneratedNextDecrease {

    @Test
    public void nextDecrease() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(90);
        solution.next(20);
        assertEquals(1, solution.next(20));
    }

}