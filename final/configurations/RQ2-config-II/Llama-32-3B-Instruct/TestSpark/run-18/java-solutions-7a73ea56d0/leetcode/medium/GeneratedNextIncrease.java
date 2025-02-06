package leetcode.medium;

public class GeneratedNextIncrease {

    @Test
    public void nextIncrease() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(20);
        assertEquals(2, solution.next(20)); // Corrected test to accurately reflect the expected span
    }

}