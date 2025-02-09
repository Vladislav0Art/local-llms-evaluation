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
public class GeneratedCalculateSpans_PricesAreDecreasing_ReturnsCorrectSpans {

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
    public void calculateSpans_PricesAreDecreasing_ReturnsCorrectSpans() {
        setup();
        double[] prices = {5.0, 3.0, 9.0};
        int[] result = onlineStockSpan.calculateSpans(prices);
        for (int i = 1; i < result.length; i++) {
            assertThat(result[i], is(i + 1));
        }
    }

}