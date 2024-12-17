package leetcode.medium;

public class GeneratedTest_calculateSpans_test {

    @Test
    public void test_calculateSpans_test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 9, 4, 3, 20};
        OnlineStockSpan.ScenarioTest scenarioTest = new OnlineStockSpan.ScenarioTest(prices);
        assertEquals(expected, result);

        onlineStockSpan = new OnlineStockSpan();
        int[] prices2 = {1, 2, 3, 4, 5};
        scenarioTest = new OnlineStockSpan.ScenarioTest(prices2);
        assertEquals(expected, result);

        onlineStockSpan = new OnlineStockSpan();
        int[] prices3 = {7, 9, 4, 3, 20};
        scenarioTest = new OnlineStockSpan.ScenarioTest(prices3);
        assertEquals(expected, result);

        onlineStockSpan = new OnlineStockSpan();
        int[] prices4 = {1, 2, 3, 4, 5};
        scenarioTest = new OnlineStockSpan.ScenarioTest(prices4);
        assertEquals(expected, result);
    }

    public int next(int price) {
        return price + 1;
    }
}

class OnlineStockSpan {
    private int[] prices;

    public OnlineStockSpan() {
        this.prices = new int[0];
    }

    public void addPrice(int price) {
        prices = Arrays.copyOf(prices, prices.length + 1);
        prices[prices.length - 1] = price;
    }
}

class ScenarioTest {

    private OnlineStockSpan onlineStockSpan;

    public ScenarioTest(int[] prices) {
        this.onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.addPrice(0);
        for (int i : prices) {
            onlineStockSpan.addPrice(i);
        }
    }

}