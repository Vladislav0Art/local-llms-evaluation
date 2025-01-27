package leetcode.medium;

public class GeneratedTest {

    private int[] elements;
    private int size;

    public Stack() {
        elements = new int[1000];
        size = 0;
    }

    public void push(int element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void pop() {
        if (!isEmpty()) {
            size--;
        }
    }
}

public class OnlineStockSpan {

    private Stack stack = new Stack();

    public int next(int price) {
        if (stack.isEmpty()) {
            stack.push(price);
            return stack.peek();
        } else {
            while (!stack.isEmpty() && stack.peek() <= price) {
                stack.pop();
            }
            stack.push(price);
            return stack.size();
        }
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = next(prices[i]);
        }
        return result;
    }
}

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
    private Stack stack = new Stack();

    @Test
    public void nextZeroPriceTest() {
        when(onlineStockSpan.next(0)).thenReturn(1);
        assertEquals(1, onlineStockSpan.next(0));
    }

    @Test
    public void nextNegativePriceTest() {
        when(onlineStockSpan.next(-10)).thenReturn(11);
        assertEquals(11, onlineStockSpan.next(-10));
    }

    @Test
    public void nextPositivePriceTest() {
        when(onlineStockSpan.next(15)).thenReturn(16);
        assertEquals(16, onlineStockSpan.next(15));
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpansSingleElementArrayTest() {
        int[] prices = {5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(6, result[0]);
    }

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        int[] prices = {2, 4, 1, 3, 7, 8, 9};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{6, 5, 5, 4, 4, 4, 4}, result);
    }

}