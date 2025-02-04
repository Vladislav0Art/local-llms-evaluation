package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestInvalidYear {

    @Test
    public void testInvalidYear() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20, result, 0.01);
    }
}

}