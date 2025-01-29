package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestCalculateMinPrice {

    @Test
    public void testCalculateMinPrice() {
        int[] prices = {3, 30, 34, 5, 9};
        Main main = new Main();
        double minPrice = (double) main.minPrice(0, 4);
        assert Double.parseDouble(minPrice) == 3.0;
    }

}