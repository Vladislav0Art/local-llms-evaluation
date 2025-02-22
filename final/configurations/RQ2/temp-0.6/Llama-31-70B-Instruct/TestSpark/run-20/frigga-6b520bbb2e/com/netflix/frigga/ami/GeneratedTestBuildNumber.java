package com.netflix.frigga.ami;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildNumber {

    AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testBuildNumber() {
        String buildNumber = "buildNumber";
        appVersion.setBuildNumber(buildNumber);
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

}