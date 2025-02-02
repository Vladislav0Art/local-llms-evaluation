package leetcode.medium;

public class GeneratedNextPriceIsGreaterThanAllPreviousValuesAndSpansAreCorrectlyCalculatedTest {

    private List<Integer> list = new ArrayList<>();
    private Stack<Integer> indexStack = new Stack<>();

    public void next(int price) {
        list.add(price);
        while (!indexStack.isEmpty() && (int) indexStack.peek() < price) {
            int prevPrice = indexStack.pop();
            calculateSpans(prevPrice);
        }
        indexStack.push(list.size());
        calculateSpans(price);
    }

    private void calculateSpans(int prevPrice) {
        if (list.size() == 1 || list.get(list.size() - 1) != prevPrice) {
            list.add(1);
        } else {
            list.set(list.size() - 1, list.get(list.size() - 1) + 1);
        }
    }

    public int[] calculateSpans(int[] prices) {
        int index = 0;
        while (index < prices.length) {
            next(prices[index]);
            index++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class GeneratedTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceIsGreaterThanAllPreviousValuesAndSpansAreCorrectlyCalculatedTest() {
        int[] prices = {7, 5, 3};
        int[] expectedSpans = {2, 1, 1, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}