package leetcode.medium;

public class GeneratedMultiplePricesAreAddedToStackAndPoppedInOrderTest {

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
    public void multiplePricesAreAddedToStackAndPoppedInOrderTest() {
        stockSpan.next(5);
        stockSpan.next(3);
        stockSpan.next(7);
        assertNotNull(stockSpan.indexStack);
        assertEquals((long) 1, ((List<Integer>) stockSpan.indexStack).size());
        assertEquals((long) 10, (int) ((List<Integer>) stockSpan.indexStack).get(0));
    }

}