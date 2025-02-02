package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateDeltaT {

    @Test
    public void testCalculateDeltaT() {
        // Create instances of DateRange for different years
        DateRange dateRange1 = new DateRange(0, 5);
        DateRange dateRange2 = new DateRange(-15, 5);
        DateRange dateRange3 = new DateRange(0, -25);

        // Calculate the DeltaT for each year
        double result1 = new DeltaT().calculateDeltaT(dateRange1.getStartDate(), dateRange1.getEndDate());
        double result2 = new DeltaT().calculateDeltaT(dateRange2.getStartDate(), dateRange2.getEndDate());
        double result3 = new DeltaT().calculateDeltaT(dateRange3.getStartDate(), dateRange3.getEndDate());

        // Verify the results
        assertEquals(-20, result1, 0.01);
        assertEquals(-25, result2, 0.01);
        assertTrue(result3 >= -15 && result3 <= 5);
    }

}