package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;

public class Generated[next][largeInput]

Test {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [next][largeInput]Test() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt(101));
        }
        stockSpan.list = list;
        for (int price : list) {
            stockSpan.next(price);
        }
        int expectedCount = 1;
        assertEquals(expectedCount, stockSpan.next(list.get(0)));
    }

}