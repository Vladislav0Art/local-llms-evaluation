package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        // Setup
        AppVersion appVersion = new AppVersion();
        AppVersion other = Mockito.mock(AppVersion.class);

        // Call method under test
        int actual = appVersion.compareTo(other);

        // Verify
        assertTrue(actual >= 0);
    }

}