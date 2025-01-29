package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void testNext_1() {
        int price = 100, result = new OnlineStockSpan().next(price);
        assertEquals(1, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(1);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_2() {
        int price = 120, result = new OnlineStockSpan().next(price);
        assertEquals(2, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(2);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(2, result2[0]);
    }

    @Test
    public void testNext_3() {
        int price = 300, result = new OnlineStockSpan().next(price);
        assertEquals(3, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(3);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(3, result2[0]);
    }

    @Test
    public void testNext_4() {
        int price = 400, result = new OnlineStockSpan().next(price);
        assertEquals(4, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(4);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(4, result2[0]);
    }

    @Test
    public void testNext_5() {
        int price = 500, result = new OnlineStockSpan().next(price);
        assertEquals(5, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(5);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(5, result2[0]);
    }

    @Test
    public void testNext_6() {
        int price = 600, result = new OnlineStockSpan().next(price);
        assertEquals(6, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(6);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(6, result2[0]);
    }

    @Test
    public void testNext_7() {
        int price = 700, result = new OnlineStockSpan().next(price);
        assertEquals(7, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(7);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(7, result2[0]);
    }

    @Test
    public void testNext_8() {
        int price = 800, result = new OnlineStockSpan().next(price);
        assertEquals(8, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(8);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(8, result2[0]);
    }

    @Test
    public void testNext_9() {
        int price = 900, result = new OnlineStockSpan().next(price);
        assertEquals(9, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(9);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(9, result2[0]);
    }

    @Test
    public void testNext_10() {
        int price = 1000;
        mockPriceList = mock(List.class);
        mockPriceList.add(price);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(price, result2[0]);
    }

    @Test
    public void testNext_11() {
        mockPriceList = mock(List.class);
        mockPriceList.add(1);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_12() {
        mockPriceList = mock(List.class);
        mockPriceList.add(1000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_13() {
        mockPriceList = mock(List.class);
        mockPriceList.add(1000000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_14() {
        mockPriceList = mock(List.class);
        mockPriceList.add(10000000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_15() {
        mockPriceList = mock(List.class);
        mockPriceList.add(100000000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_16() {
        mockPriceList = mock(List.class);
        mockPriceList.add(1000000000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_17() {
        mockPriceList = mock(List.class);
        mockPriceList.add(10000000000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_18() {
        mockPriceList = mock(List.class);
        mockPriceList.add(100000000000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_19() {
        mockPriceList = mock(List.class);
        mockPriceList.add(1000000000000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

    @Test
    public void testNext_20() {
        mockPriceList = mock(List.class);
        mockPriceList.add(10000000000000);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

}