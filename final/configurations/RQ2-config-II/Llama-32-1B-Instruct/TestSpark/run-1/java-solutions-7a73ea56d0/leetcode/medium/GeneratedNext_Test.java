package leetcode.medium;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class GeneratedNext_Test {

    private static OnlineStockSpan instance;
    private List<Integer> priceHistory = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();

    @BeforeAll
    public void init() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void next_Test() throws Exception {
        int[] prices = {1, 7, 6, 9};
        int result = instance.next(0);
        assertEquals(4, result); // actual: 1 + 6 + 2 + 5 = 14

        int[] prices2 = {10, 20, 30, 40, 50};
        result = instance.next(prices[0]);
        assertEquals(15, result); // actual: 10 + 4 + 3 = 17

        int[] prices3 = {1, 9, 8, 7, 6, 5, 4, 3, 2};
        result = instance.next(prices[0]);
        assertEquals(4, result); // actual: 1 + 8 + 7 + 6 + 5 + 4 = 31

        int[] prices4 = {10, 20, 30, 40, 50, 60};
        result = instance.next(prices[0]);
        assertEquals(61, result); // actual: 10 + 1 + 59 = 70
    }

}