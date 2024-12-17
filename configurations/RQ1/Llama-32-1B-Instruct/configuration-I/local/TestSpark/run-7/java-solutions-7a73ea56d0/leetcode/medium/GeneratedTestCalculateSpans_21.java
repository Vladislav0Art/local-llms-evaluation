package leetcode.medium;

import leetcode.medium.OnlineStockSpan.TestOnlineStockSpanTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSpans_21 {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @BeforeEach
    void setup() {
        TestOnlineStockSpan test1 = new TestOnlineStockSpan();
        TestOnlineStockSpan test2 = new TestOnlineStockSpan();
        TestOnlineStockSpan test3 = new TestOnlineStockSpan();
        TestOnlineStockSpanTest.testCalculateSpans_11Test(test1, instance);
        TestOnlineStockSpanTest.testCalculateSpans_12Test(test2, instance);
        TestOnlineStockSpanTest.testCalculateSpans_21Test(test3, instance);
    }

    @Test
    public void testCalculateSpans_21() {
        int[] prices = new int[]{9, 8, 7, 6, 5};
        int expected = new int[]{3, 2};

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int[] result = instance.calculateSpans(prices);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", prices);
        TestOnlineStockSpanTest.assertArrayEquals(result, expected);
    }

}