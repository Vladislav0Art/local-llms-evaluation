package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

public class GeneratedTest {

    public double calculateDeltaT(LocalDate date) {
        return 30.0;
    }
}

public class DeltaT {

    public static double estimate(LocalDate date) {
        NetE175KlausSolarPositioningNetE175KlausSolarPositioningHelper helperMethodMock = new NetE175KlausSolarPositioningNetE175KlausSolarPositioningHelper();
        return helperMethodMock.calculateDeltaT(date);
    }
}

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

public class DeltaTTest {

    @Mock
    private NetE175KlausSolarPositioningNetE175KlausSolarPositioningHelper helperMethodMock;

    public static double calculateDeltaT(LocalDate date) {
        return 30.0;
    }

}