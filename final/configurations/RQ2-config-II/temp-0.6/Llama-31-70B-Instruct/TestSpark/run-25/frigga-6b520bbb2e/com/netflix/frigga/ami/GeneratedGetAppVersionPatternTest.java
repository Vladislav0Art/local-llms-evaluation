package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        // Setup
        AppVersion appVersion = new AppVersion();

        // Call method under test
        Pattern actual = appVersion.getAppVersionPattern();

        // Verify
        assertNotNull(actual);
    }

}