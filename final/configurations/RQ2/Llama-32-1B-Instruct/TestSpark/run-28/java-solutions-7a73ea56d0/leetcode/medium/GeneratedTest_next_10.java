package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.jupiter.api.Test;

public class GeneratedTest_next_10 {

    @Test
    public void test_next_10() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            onlineStockSpan.next(i + 1);
        }
        int[] prices = {100, 200, 300, 400, 500};
        int[] result = onlineStockSpan.calculateSpans(prices);
        System.out.println(java.util.Arrays.toString(result));
    }

}