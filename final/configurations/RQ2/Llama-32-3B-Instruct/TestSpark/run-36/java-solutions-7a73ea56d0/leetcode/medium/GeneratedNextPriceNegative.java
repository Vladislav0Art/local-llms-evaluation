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
public class GeneratedNextPriceNegative {

    @Mock
    private Stack<Integer> stockSpanStack;

    public StockSpanCalculator calculator = new StockSpanCalculator(stockSpanStack);

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