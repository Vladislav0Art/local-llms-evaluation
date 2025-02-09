package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedNext_NegativeNumbers {

    @Test
    public void next_NegativeNumbers() {
        OnlineStockSpan solution = new OnlineStockSpan();
        Random random = new Random(1234);
        for (int i = 0; i < 10000; i++) {
            int price = -random.nextInt(50) + 10;
            solution.next(price);
        }
    }

}