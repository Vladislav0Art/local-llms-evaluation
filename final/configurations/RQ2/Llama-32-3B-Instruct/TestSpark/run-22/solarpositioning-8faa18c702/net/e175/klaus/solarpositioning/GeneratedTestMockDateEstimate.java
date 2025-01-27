package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestMockDateEstimate {

    @Test
    public void testMockDateEstimate() {
        when(DeltaT.mockDate().estimate(any(Date.class))).thenReturn((double) 0.05L);
        assertThat(DeltaT.mockDate().estimate(new Date()), is(0.05L));
    }
}

public class DeltaTEstimator {

    private final Map<Date, Double> estimateMap = new HashMap<>();
    private final Map<Date, Date> mockDateMap = new HashMap<>();

    public void setEstimateMap(Map<Date, Double> map) {
        this.estimateMap.putAll(map);
    }

    public void setMockDateMap(Map<Date, Date> map) {
        this.mockDateMap.putAll(map);
    }

    public double estimate(Date date) {
        return estimateMap.getOrDefault(date, 0.0);
    }

    public Date mockDate() {
        return mockDateMap.get(date -> true); // dummy implementation
    }
}

public class DeltaT {

    private final Map<Date, Double> estimateMap = new HashMap<>();
    private final Map<Date, Date> mockDateMap = new HashMap<>();

    public void setEstimateMap(Map<Date, Double> map) {
        this.estimateMap.putAll(map);
    }

    public void setMockDateMap(Map<Date, Date> map) {
        this.mockDateMap.putAll(map);
    }

    public double estimate(Date date) {
        return estimateMap.getOrDefault(date, 0.0);
    }

    public Date mockDate() {
        return mockDateMap.get(date -> true); // dummy implementation
    }
}

public class When {

    private final DeltaT deltaT = new DeltaT();

    public void whenDeltaTEstimate(Date date) {
        deltaT.setEstimateMap(Map.of(date, 0.05L));
    }

    public void whenMockDeltaTEstimate(double value) {
        deltaT.setEstimateMap(Map.of());
        deltaT.setMockDateMap(Map.of(new Date(), value));
    }

}