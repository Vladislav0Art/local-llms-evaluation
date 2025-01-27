package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class GeneratedCalculateSpans_EmptyArrayAndSingleElementArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_EmptyArrayAndSingleElementArray_ReturnsCorrectSpans() {
        OnlineStackSpan onlineStackSpan = new OnlineStackSpan();
        int[] prices1 = {100};
        int[] result1 = onlineStackSpan.calculateSpans(prices1);
        assertEquals(1, result1[0]);
        int[] prices2 = {};
        int[] result2 = onlineStackSpan.calculateSpans(prices2);
        assertEquals(0, result2.length);
    }

    private static class OnlineStackSpan {
        List<DayPrice> stack = new ArrayList<>();

        public DayPrice next(int price) {
            DayPrice topElement = getTopElement();
            if (topElement != null && topElement.price >= price) {
                return topElement.span + 1;
            }
            DayPrice dayPrice = new DayPrice(price);
            while (!stack.isEmpty() && stack.get(stack.size() - 1).price < price)
                stack.remove(stack.size() - 1);

            if (stack.isEmpty()) {
                stack.add(dayPrice);
                return 1;
            }

            dayPrice.span = stack.get(stack.size() - 1).span + 1;
            stack.set(stack.size() - 1, dayPrice);
            return stack.get(stack.size() - 1).span;

        }

        public int[] calculateSpans(int[] prices) {
            for (int price : prices)
                next(price);

            int[] result = new int[prices.length];
            for (int i = 0; i < result.length; i++)
                result[i] = stack.get(i).span;
            return result;
        }
    }

    private static class DayPrice {
        int span;
        int price;

        public DayPrice(int price) {
            this.price = price;
        }

        public int getSpan() {
            return span;
        }

        public void setSpan(int span) {
            this.span = span;
        }

        @Override
        public String toString() {
            return "DayPrice{" +
                    "span=" + span +
                    ", price=" + price +
                    '}';
        }
    }

}