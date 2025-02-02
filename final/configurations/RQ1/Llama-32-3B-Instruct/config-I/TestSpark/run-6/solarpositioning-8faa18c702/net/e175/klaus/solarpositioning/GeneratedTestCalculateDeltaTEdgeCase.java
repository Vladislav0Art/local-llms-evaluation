package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateDeltaTEdgeCase {

    @Test
    public void testCalculateDeltaTEdgeCase() {
        DateRange dateRange = new DateRange(2020, 1);

        double result = new DeltaT().calculateDeltaT(dateRange.getStartDate(), dateRange.getEndDate());

        assertTrue(result >= -15 && result <= 5);
    }

}