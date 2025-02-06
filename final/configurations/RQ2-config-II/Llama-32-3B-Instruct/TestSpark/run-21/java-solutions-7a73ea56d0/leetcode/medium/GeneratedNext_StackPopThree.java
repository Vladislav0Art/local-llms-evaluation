package leetcode.medium;

public class GeneratedNext_StackPopThree {

    @Test
    public void next_StackPopThree() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(0);
        assertNull(onlineStockSpan.priceStack.pop());
        result = onlineStockSpan.next(1);
        assertNull(onlineStockSpan.priceStack.pop());
        result = onlineStockSpan.next(-2);
        assertNull(onlineStockSpan.priceStack.pop());
    }

    private static class OnlineStackSpan extends OnlineStockSpan {
        Stack<Integer> priceStack = new Stack<>();
        List<Integer> stockPriceStack = new ArrayList<>();

        @Override
        public int next(int price) {
            while (!priceStack.isEmpty() && stockPriceStack.get(priceStack.peek()) <= price) {
                priceStack.pop();
            }
            if (priceStack.isEmpty()) {
                stockPriceStack.add(0);
            } else {
                stockPriceStack.add(stockPriceStack.get(priceStack.peek()));
            }
            int span = priceStack.size() + 1;
            priceStack.push(price);
            return span;
        }

        @Override
        public int[] calculateSpans(int[] prices) {
            int[] result = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                int index = 0;
                while (!priceStack.isEmpty() && stockPriceStack.get(priceStack.peek()) <= prices[i]) {
                    priceStack.pop();
                    index++;
                }
                if (priceStack.isEmpty()) {
                    result[i] = 1;
                } else {
                    result[i] = index + 1;
                }
            }
            return result;
        }
    }

}