package leetcode.medium;

import leetcode.medium.OnlineStockSpan.TestOnlineStockSpanTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestNext_4 {

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
    public void testNext_4() {
        int price = 9;
        int expected = 3;

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int result = instance.next(price);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", Arrays.asList(9));
        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "count", 2);
    }

}