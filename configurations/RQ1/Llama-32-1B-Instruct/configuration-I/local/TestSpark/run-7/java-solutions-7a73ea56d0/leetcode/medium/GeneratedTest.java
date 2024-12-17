package leetcode.medium;

import leetcode.medium.OnlineStockSpan.TestOnlineStockSpanTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

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

    @Test
    public void testNext_2() {
        int price = 5;
        int expected = 1;

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int result = instance.next(price);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", Arrays.asList(5));
        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "count", 0);
    }

    @Test
    public void testNext_3() {
        int price = 6;
        int expected = 2;

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int result = instance.next(price);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", Arrays.asList(5));
        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "count", 1);
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

    @Test
    public void testNext_5() {
        int price = 1;
        int expected = 0;

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int result = instance.next(price);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", Arrays.asList(1));
        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "count", 2);
    }

    @Test
    public void testNext_6() {
        int price = 0;
        int expected = 2;

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int result = instance.next(price);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", Arrays.asList(0));
        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "count", 1);
    }

    @Test
    public void testCalculateSpans_11() {
        int[] prices = new int[]{7, 6, 5, 4, 3, 2, 1};
        int expected = new int[]{1, 1, 2, 2, 3, 3, 4};

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int[] result = instance.calculateSpans(prices);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", prices);
        TestOnlineStockSpanTest.assertArrayEquals(result, expected);
    }

    @Test
    public void testCalculateSpans_12() {
        int[] prices = new int[]{5, 4, 3, 2, 1};
        int expected = new int[]{1, 1, 2, 2, 3};

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int[] result = instance.calculateSpans(prices);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", prices);
        TestOnlineStockSpanTest.assertArrayEquals(result, expected);
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

    @Test
    public void testCalculateSpans_31() {
        int[] prices = new int[]{10, 20};
        int expected = new int[]{2, 1};

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int[] result = instance.calculateSpans(prices);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", prices);
        TestOnlineStockSpanTest.assertArrayEquals(result, expected);
    }

    @Test
    public void testCalculateSpans_41() {
        int[] prices = new int[]{4};
        int expected = new int[]{1};

        OnlineStockSpanSpy instanceSpy = new OnlineStockSpanSpy();
        int[] result = instance.calculateSpans(prices);

        TestOnlineStockSpanTest.assertMethodCall(instanceSpy, "list", prices);
        TestOnlineStockSpanTest.assertArrayEquals(result, expected);
    }

    @BeforeEach
    void setupSpy() {
        instanceSpy = new OnlineStockSpanSpy();
    }

}