package leetcode.medium;

public class GeneratedNextPrice_SameNumber_ReturnsCountFromPreviousElement {

    @Test
    public void nextPrice_SameNumber_ReturnsCountFromPreviousElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(10);
        int expected = solution.next(10) + 1;
        assertEquals(expected, result);
    }

}