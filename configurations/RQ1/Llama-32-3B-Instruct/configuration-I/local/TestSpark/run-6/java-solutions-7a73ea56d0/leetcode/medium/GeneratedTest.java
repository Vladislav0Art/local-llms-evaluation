package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void next_PricesAreEqual_ReturnsCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int price = 100;
        assertEquals(1, stockSpan.next(price));
    }

    @Test
    public void next_PricesAreNotEqual_ReturnsCorrectCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int price1 = 100;
        int price2 = 150;
        assertEquals(3, stockSpan.next(price1));
    }

    @Test
    public void next_StackIsEmpty_ReturnsCorrectCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int price = 150;
        assertEquals(1, stockSpan.next(price));
    }

    @Test
    public void calculateSpans_PricesAreEqual_ReturnsCorrectArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int[] prices = {100};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
    }

    @Test
    public void calculateSpans_PricesAreNotEqual_ReturnsCorrectArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int[] prices = {100, 150};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(3, spans[0]);
    }

    @Test
    public void calculateSpans_PricesAreInOrder_ReturnsCorrectArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        stockSpan.list = list;
        int[] prices = {100, 150, 200};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
    }

}