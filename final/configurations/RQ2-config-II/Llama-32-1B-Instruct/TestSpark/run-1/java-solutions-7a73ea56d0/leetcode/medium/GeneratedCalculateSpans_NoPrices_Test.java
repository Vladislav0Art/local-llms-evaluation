package leetcode.medium;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class GeneratedCalculateSpans_NoPrices_Test {

    private static OnlineStockSpan instance;
    private List<Integer> priceHistory = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();

    @BeforeAll
    public void init() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void calculateSpans_NoPrices_Test() throws Exception {
        int[] prices = {};
        OnlineStockSpan.ScenarioTest scenarioTest = new OnlineStockSpan.ScenarioTest();
        int result = instance.calculateSpans(prices);
        assertEquals(-1, result); // actual: no previous price found
    }

    @Before
    public void initMocking() {
        Mockito.mock(OnlineStockSpan.class, "next");
        Mockito.mock(OnlineStockSpan.class, "calculateSpans", Mockito.SpyBean);
    }

}