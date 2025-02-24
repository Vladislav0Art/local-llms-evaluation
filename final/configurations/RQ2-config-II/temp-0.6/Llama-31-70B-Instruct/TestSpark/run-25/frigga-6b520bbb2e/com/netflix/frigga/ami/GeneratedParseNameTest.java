package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        // Setup
        String amiName = "test_name";
        AppVersion appVersion = new AppVersion();

        // Call method under test
        AppVersion actual = appVersion.parseName(amiName);

        // Verify
        assertNotNull(actual);
    }

}