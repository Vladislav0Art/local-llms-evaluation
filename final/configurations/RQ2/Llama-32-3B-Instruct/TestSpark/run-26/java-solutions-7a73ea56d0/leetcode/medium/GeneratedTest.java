package leetcode.medium;

public class GeneratedTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void nextPriceIsIncrasedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stack.size());
    }

    @Test
    public void firstDayNoDaysTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{});
        assertEquals(new int[]{0}, result);
    }

    @Test
    public void nextPriceZeroTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stack = new java.util.Stack<>();
        stock.push(100);
        stock.push(50);
        stock.push(-1);
        stock.push(2);
        stock.push(3);
        int price = -1;
        stockSpan.next(price);
        assertEquals(4, stack.size());
    }

    @Test
    public void nextPriceNegativeTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{0});
        assertEquals(new int[]{0}, result);
    }

    @Test
    public void calculateSpansZeroPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{0, 2, -1});
        assertEquals(new int[]{3, 5, 2}, result);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stack = new java.util.Stack<>();
        stack.push(100);
        int price = 1;
        stockSpan.next(price);
        assertEquals(0, stack.size());
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stack = new java.util.Stack<>();
        stack.push(2);
        stack.push(3);
        int price = 4;
        stockSpan.next(price);
        assertEquals(5, stack.size());
    }

    @Test
    public void calculateSpansPositivePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stack = new java.util.Stack<>();
        stack.push(2);
        stack.push(3);
        int price = 4;
        stockSpan.next(price);
        assertEquals(new int[]{5, 6}, stockSpan.calculateSpans(new int[]{}));
    }

}