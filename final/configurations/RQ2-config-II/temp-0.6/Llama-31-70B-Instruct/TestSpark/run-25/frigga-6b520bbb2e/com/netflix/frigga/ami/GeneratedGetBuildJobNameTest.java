package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        // Setup
        AppVersion appVersion = new AppVersion();

        // Call method under test
        String actual = appVersion.getBuildJobName();

        // Verify
        assertNotNull(actual);
    }

}