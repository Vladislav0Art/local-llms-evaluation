package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.junit.Assert;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsInstanceOf;

import java.time.LocalDate;

import static org.junit.Assert.assertThrows;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateForInvalidDate_ThrowsException {

    @Test
    public void estimateForInvalidDate_ThrowsException() {
        LocalDate invalidDate = LocalDate.of(9999, 12, 25); // Invalid date (year out of range)

        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(invalidDate));
    }
}

class DateUtils {

    public static void setDate(LocalDate date, int year) {
        date = date.withYear(year);
    }

    public static void setDay(LocalDate date, int dayOfMonth) {
        date = date.withDayOfMonth(dayOfMonth);
    }

}