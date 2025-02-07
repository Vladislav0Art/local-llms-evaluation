package leetcode.medium;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class GeneratedCalculateSpans_Test {

    private static OnlineStockSpan instance;
    private List<Integer> priceHistory = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();

    @BeforeAll
    public void init() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void calculateSpans_Test() throws Exception {
        int[] prices = {2, 7, 6, 9};
        OnlineStockSpan.ScenarioTest scenarioTest = new OnlineStockSpan.ScenarioTest();
        int result = instance.calculateSpans(prices);
        assertEquals(4, result); // actual: 1 + 5 + 0 + 4 = 10

        prices2 = {2, 7, 6, 9};
        result = instance.calculateSpans(prices2);
        assertEquals(3, result); // actual: 1 + 5 = 6

        prices3 = {2, 3, 5, 8};
        result = instance.calculateSpans(prices3);
        assertEquals(0, result); // actual: 0
    }

}