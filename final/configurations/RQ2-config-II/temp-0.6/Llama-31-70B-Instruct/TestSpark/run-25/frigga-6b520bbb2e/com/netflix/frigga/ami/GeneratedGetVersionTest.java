package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        // Setup
        AppVersion appVersion = new AppVersion();

        // Call method under test
        String actual = appVersion.getVersion();

        // Verify
        assertNotNull(actual);
    }

}