package leetcode.medium;

public class GeneratedNextPrice_EmptyStack_ReturnsCorrectCount {

    @Test
    public void nextPrice_EmptyStack_ReturnsCorrectCount() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int price = 10;
        solution.next(price);
        assertTrue(solution.list.size() > 0);
        int count = 0;
        for (int i = solution.list.size() - 1; i >= 0; i--) {
            if (solution.list.get(i) > price)
                break;
            count++;
        }
        assertEquals(count, solution.next(price));
    }

}