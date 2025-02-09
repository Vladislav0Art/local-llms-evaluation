package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsLeapYear_ThrowsExceptionForInvalidInput {

    @Mock
    private LocalDate forDate;

    @Test
    public void isLeapYear_ThrowsExceptionForInvalidInput() {
        assertThrows(Exception.class, () -> DeltaT.isLeapYear(LocalDate.of(2020, 1, 29)));
    }

}