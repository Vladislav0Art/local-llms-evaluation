package leetcode.medium;

public class GeneratedNext_DuplicatePrices_ReturnsIncreasedLength {

    @Test
    public void next_DuplicatePrices_ReturnsIncreasedLength() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(100);
        assertEquals(1, result);

        result = solution.next(100);
        assertEquals(2, result);
    }

}