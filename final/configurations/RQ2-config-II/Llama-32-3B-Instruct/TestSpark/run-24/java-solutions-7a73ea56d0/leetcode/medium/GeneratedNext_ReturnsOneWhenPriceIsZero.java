package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedNext_ReturnsOneWhenPriceIsZero {

    @Test
    public void next_ReturnsOneWhenPriceIsZero() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(0);
        assertThat(result, is(1));
    }

}