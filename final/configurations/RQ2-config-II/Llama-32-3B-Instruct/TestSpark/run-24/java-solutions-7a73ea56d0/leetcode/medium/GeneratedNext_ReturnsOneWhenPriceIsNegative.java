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
public class GeneratedNext_ReturnsOneWhenPriceIsNegative {

    @Test
    public void next_ReturnsOneWhenPriceIsNegative() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(-1000);
        assertThat(result, is(1));
    }

}