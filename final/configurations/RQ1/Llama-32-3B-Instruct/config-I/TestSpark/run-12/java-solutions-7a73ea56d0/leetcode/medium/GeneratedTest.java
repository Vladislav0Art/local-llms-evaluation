package leetcode.medium;

public class GeneratedTest {

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

    @Test
    public void multiplePricesAreAddedToStackAndPoppedInOrderTest() {
        stockSpan.next(5);
        stockSpan.next(3);
        stockSpan.next(7);
        assertNotNull(stockSpan.indexStack);
        assertEquals((long) 1, ((List<Integer>) stockSpan.indexStack).size());
        assertEquals((long) 10, (int) ((List<Integer>) stockSpan.indexStack).get(0));
    }

    @Test
    public void nextPriceIsGreaterThanAllPreviousValuesAndSpansAreCorrectlyCalculatedTest() {
        int[] prices = {7, 5, 3};
        int[] expectedSpans = {2, 1, 1, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void nextPriceIsLessThanAllPreviousValuesAndIndexStackRemainsEmptyTest() {
        int[] prices = {7, 5, 3};
        int[] expectedSpans = new int[]{2, 1, 1, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void nextPriceIsGreaterOrEqualThanAllPreviousValuesAndIndexStackRemainsEmptyAfterPopUntilWeHitCorrectValueTest() {
        int[] prices = {7, 5};
        int[] expectedSpans = new int[]{2, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {7, 5, 3};
        int[] expectedSpans = {2, 1, 1, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}