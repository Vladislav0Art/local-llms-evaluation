package leetcode.medium;

public class GeneratedNextPrice_MultipleConsecutiveDecreases_DeterministicResult {

    private Stack<Integer> stack;
    private List<Integer> list;

    public OnlineStockSpan() {
        this.stack = new Stack<>();
        this.list = new ArrayList<>();
    }

    public int next(int price) {
        while (!stack.isEmpty() && stack.peek() <= price) {
            list.add(stack.pop());
        }
        stack.push(price);
        return list.size();
    }

    public int[] calculateSpans() {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class GeneratedTest {

    @Test
    public void nextPrice_MultipleConsecutiveDecreases_DeterministicResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i 10;
        i++){
            int price = 100 - i;
            onlineStockSpan.next(price);
        }
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans());
    }

}