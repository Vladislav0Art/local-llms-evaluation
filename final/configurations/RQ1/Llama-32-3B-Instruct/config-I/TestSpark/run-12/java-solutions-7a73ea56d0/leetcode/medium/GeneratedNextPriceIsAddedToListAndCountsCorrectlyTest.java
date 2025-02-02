package leetcode.medium;

public class GeneratedNextPriceIsAddedToListAndCountsCorrectlyTest {

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
    public void nextPriceIsAddedToListAndCountsCorrectlyTest() {
        stockSpan.next(10);
        assertEquals(1, stockSpan.list.size());
        assertEquals((long) 10, stockSpan.list.get(0));
    }

}