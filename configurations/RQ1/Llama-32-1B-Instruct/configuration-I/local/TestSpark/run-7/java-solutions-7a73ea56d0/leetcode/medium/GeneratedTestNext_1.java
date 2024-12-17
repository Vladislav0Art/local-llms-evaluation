package leetcode.medium;

import leetcode.medium.OnlineStockSpan.TestOnlineStockSpanTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestNext_1 {

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
    public void testNext_1() {
        int price = 7;
        int expected = 1;

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int result = instance.next(price);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", Arrays.asList(7));
        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "count", 1);
    }

}