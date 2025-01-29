package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_estimate_unsuccessful_finally_block {

    @Test
    public void test_estimate_unsuccessful_finally_block() {
        LocalDate forDate = null;
        try {
            estimate(forDate);
		finally{
                System.out.println("Unexpected date");
            }
        } catch (IllegalStateException e) {
            assertEquals("Failed to determine date", e.getMessage());
        }
    }

}