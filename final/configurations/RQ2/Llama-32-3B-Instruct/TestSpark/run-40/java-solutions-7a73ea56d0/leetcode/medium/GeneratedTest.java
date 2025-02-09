package leetcode.medium;

public class GeneratedTest {


    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_Int_Price_Returns_1() {
        assertEquals(1, onlineStockSpan.next(100));
    }

    @Test
    public void next_Int_Price_Returns_0() {
        assertEquals(0, onlineStockSpan.next(50));
    }

    @Test
    public void next_Same_Price_TwoConsecutiveDays_Returns_2() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        assertEquals(2, onlineStockSpan.next(10));
    }

    @Test
    public void calculateSpans_EmptyArray_Returns_EmptyArray() {
        int[] prices = new int[0];
        assertArrayEquals(new int[]{}, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_SingleElementArray_Returns_ArrayWithOneElement() {
        int[] prices = {100};
        assertArrayEquals(new int[]{1}, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_MultipleElementsArray_Returns_CorrectSpans() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        int[] prices = {10, 20, 30};
        int[] expectedSpans = {1, 2, 3};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_DuplicateElementsArray_Returns_CorrectSpans() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        onlineStockSpan.next(30);
        int[] prices = {10, 20, 30, 30};
        int[] expectedSpans = {1, 2, 3, 4};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    private static class MockNext {

        public int next(int price) {
            return 0;
        }
    }

    @Test
    public void calculateSpans_MockedNext_Returns_CorrectSpans() {
        MockNext mockNext = new MockNext();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        mockNext.next(40);
        int[] prices = {10, 20, 30, 40};
        int[] expectedSpans = {1, 2, 3, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

    private static class MockStack {

        public void push(int price) {
        }

        public int pop() {
            return 0;
        }
    }

    @Test
    public void calculateSpans_MockStack_Returns_CorrectSpans() {
        MockStack mockStack = new MockStack();
        onlineStockSpan.next(10);
        mockStack.push(10);
        onlineStockSpan.next(20);
        mockStack.push(20);
        onlineStockSpan.next(30);
        mockStack.push(30);
        int[] prices = {10, 20, 30};
        int[] expectedSpans = {1, 2, 3};
        result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

}