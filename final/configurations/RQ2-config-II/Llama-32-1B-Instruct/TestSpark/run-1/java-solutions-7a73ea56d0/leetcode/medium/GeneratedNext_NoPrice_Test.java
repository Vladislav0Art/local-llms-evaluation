package leetcode.medium;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class GeneratedNext_NoPrice_Test {

    private static OnlineStockSpan instance;
    private List<Integer> priceHistory = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();

    @BeforeAll
    public void init() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void next_NoPrice_Test() throws Exception {
        int[] prices = {};
        OnlineStockSpan.ScenarioTest scenarioTest = new OnlineStockSpan.ScenarioTest();
        int result = instance.next(0);
        assertEquals(-1, result); // actual: no previous price found

        prices2 = {5};
        result = instance.next(0);
        assertEquals(-1, result); // actual: no previous price found
    }

}