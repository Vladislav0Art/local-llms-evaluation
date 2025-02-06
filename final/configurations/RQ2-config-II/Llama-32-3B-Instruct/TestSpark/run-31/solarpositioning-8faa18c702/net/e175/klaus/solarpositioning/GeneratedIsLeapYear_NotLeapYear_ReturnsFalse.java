package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsLeapYear_NotLeapYear_ReturnsFalse {

    @Mock
    private Optional<LocalDate> forDateMock;

    @Test
    public void isLeapYear_NotLeapYear_ReturnsFalse() {
        assertFalse(DeltaT.isLeapYear(2019));
    }

}