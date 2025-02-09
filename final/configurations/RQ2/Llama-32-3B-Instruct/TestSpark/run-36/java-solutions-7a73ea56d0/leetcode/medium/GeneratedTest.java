package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Stack<Integer> stockSpanStack;

    public StockSpanCalculator calculator = new StockSpanCalculator(stockSpanStack);

    @Test
    public void nextPriceSingle() {
        when(calculator.next(anyInt())).thenReturn(1);
    }

    @Test
    public void nextPriceMultiple() {
        int[] prices = {1, 2, 3, 4, 5};
        for (int price : prices) {
            calculator.next(price);
        }
        int[] result = new int[prices.length];
        Arrays.setAll(result, (i, e) -> i + 1);
        assertEquals(Arrays.toString(result), Arrays.toString(calculator.calculateSpans(prices)));
    }

    @Test
    public void nextPriceNoMovement() {
        when(calculator.next(anyInt())).thenReturn(2);
        int[] prices = {2, 2, 2};
        for (int price : prices) {
            calculator.next(price);
        }
        int[] result = new int[prices.length];
        Arrays.setAll(result, (i, e) -> i + 1);
        assertEquals(Arrays.toString(result), Arrays.toString(calculator.calculateSpans(prices)));
    }

    @Test
    public void nextPriceMultipleWithDecrease() {
        when(calculator.next(anyInt())).thenReturn(2);
        int[] prices = {3, 2};
        for (int price : prices) {
            calculator.next(price);
        }
        int[] result = new int[prices.length];
        Arrays.setAll(result, (i, e) -> i + 1);
        assertEquals(Arrays.toString(result), Arrays.toString(calculator.calculateSpans(prices)));
    }

    @Test
    public void nextPriceZero() {
        when(calculator.next(anyInt())).thenReturn(0);
        int[] prices = {2};
        for (int price : prices) {
            calculator.next(price);
        }
        int[] result = new int[prices.length];
        Arrays.setAll(result, (i, e) -> i + 1);
        assertEquals(Arrays.toString(result), Arrays.toString(calculator.calculateSpans(prices)));
    }

    @Test
    public void nextPriceNegative() {
        calculator.next(-1);
    }
}

class StockSpanCalculator {
    private Stack<Integer> stockSpanStack;

    public StockSpanCalculator(Stack<Integer> stack) {
        this.stockSpanStack = stack;
    }

    public int next(int price) {
        if (price < 0) {
            throw new RuntimeException("Invalid input");
        }
        return stockSpanStack.push(price);
    }

    public int[] calculateSpans(int[] prices) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> currentStockPrice = new Stack<>();
        for (int price : prices) {
            if (!currentStockPrice.isEmpty() && currentStockPrice.peek() == price) {
                currentStockPrice.pop();
            }
            int span = currentStockPrice.isEmpty() ? 1 : currentStockPrice.peek() - price + 1;
            result.add(span);
            currentStockPrice.push(price);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}