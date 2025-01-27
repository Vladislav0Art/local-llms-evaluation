package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void next_NoPrice_ReturnsZero() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(0);
        assertEquals(0, result);
    }

    @Test
    public void next_SingleDayPrice_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

    @Test
    public void next_DifferentDaysPrices_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            int result = onlineStockSpan.next(price);
            assertEquals(1 + (onlineStackSpan.stack.size() == 0 ? 0 : stack.get(stack.size() - 1).span), result);
        }
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(6, result.length);
    }

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