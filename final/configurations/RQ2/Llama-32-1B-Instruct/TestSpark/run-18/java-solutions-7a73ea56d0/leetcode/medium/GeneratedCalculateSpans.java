package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans() {
        List<Integer> prices = new ArrayList<>();
        prices.add(50);
        prices.add(3000);
        prices.add(15);

        int[] expectedSpans = {1, 4, 2};
        onlineStockSpan.calculateSpans(prices);

        assertOnlineLineCoverage(expectedSpans, "calculateSpans");

        int[][] actualSpans = new int[prices.size()][3];
        for (int i = 0; i < prices.size(); i++) {
            int span = 1;
            for (int j = 0; j < prices.get(i).length; j++) {
                if (i > 0 && prices.get(i - 1) != null && prices.get(i).compareTo(prices.get(i - 1)) == 0) {
                    span += prices.get(i).intValue();
                } else if (prices.get(i).compareTo(prices.get(i - 1)) < 0 || prices.get(i).equals(null)) {
                    break;
                }
            }
            actualSpans[i][2] = span; // coverage: max line coverage of the method with different positions
        }

        assertOnlineLineCoverage(expectedSpans, "calculateSpans");

        assertEquals(6, onlineStockSpan.calculateSpans(prices).length); // coverage: max line coverage of the class
    }

    private void assertOnlineLineCoverage(int[][] expectedSpans, String methodName) {
        for (int i = 0; i < prices.size(); i++) {
            int actualSpans = onlineStockSpan.getScansForIndex(i);
            for (int j = 0; j < 3; j++) {
                assertEquals(expectedSpans[i][j], actualSpans[j]);
            }
        }
    }

    public OnlineStockSpan getScansForIndex(int index) {
        List<Integer> scans = new ArrayList<>();
        while (index > 0) {
            if (prices.get(index).equals(null)) break;
            int nextIndex = onlineStockSpan.next(prices.get(index));
            if (nextIndex < prices.size()) {
                scans.add(nextIndex);
                index = nextIndex;
            } else {
                break;
            }
        }
        return scans;
    }

}