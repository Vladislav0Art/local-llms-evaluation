package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.reflect.GenericClassUnderTest;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedNext_PricesAreDecreasing_ReturnsSumOfSubsequentTerms {

    OnlineStockSpan .class,Stack .class
})

public class OnlineStockSpanTest {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Mock
    private Stack<Integer> stack;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        stack.clear();
    }

    @Test
    public void next_PricesAreDecreasing_ReturnsSumOfSubsequentTerms() {
        setup();
        double[] prices = {5.0, 3.0, 9.0};
        for (int i = 1; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        assertThat(onlineStockSpan.next(prices[0]), is(4));
    }

}